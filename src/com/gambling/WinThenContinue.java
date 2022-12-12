package com.gambling;

import java.util.Random;

public class WinThenContinue {
    static int stake = 100;
    static int bet = 1;
    static int totalWiningAmount=0;
    static int betCount=0;
    static int[] monthDays={31,28,30,31,30,31,30,31,30,31,30,31};
    static String[] monthName={"January","February", "March","April","May","June","July","August","September","October","November","December"};
    static int totalWinMoney=0;
    static int monthWiningAmount=0;
    static int win=0,lost=0,luckiestDays=0,unluckiestDays=0,wonCount=0,lostCount=0;
    static int[] luckiestDay=new int [30];
    static int[] unluckiestDay=new int [30];
    public static void main(String[] args) {
        System.out.println("\nWelcome to Gambling Simulation Problem");
        System.out.println("\nGambler every day stake is " + stake);
        System.out.println("Bet is " + bet);
        winOrLooseGame();
        winOrLooseAmount();
        monthWinOrLooseDayt();
        checkLuckyOrUnluckyDay();

    }

    public static void winOrLooseGame() {

        Random random = new Random();
        int bet = random.nextInt(2);
        if (bet == 1) {

            System.out.println("\nGambler make $1 Win the bet");
        } else {
            System.out.println("\nGambler loose the bet");
        }

    }

    public static int resignForTheDay() {
        while (stake != 50 && stake != 110) {
            System.out.println("--------------------------------");
            Random random = new Random();
            int randomCheck = random.nextInt(2);
            if (randomCheck == 0) {
                stake = stake - bet;
                System.out.println("Gambler Lost 50% of stake....You have to resign for the day");
            } else {
                stake = stake + bet;
                System.out.println("Gambler Won 50% of stake...You have to resign for the day");
                System.out.println("Stake value is " + stake);
            }
        }
        return stake;
    }
    public static int winOrLooseAmount(){

        for (int i=0; i<=20; i++){
            while (stake != 50 && stake != 110) {
                System.out.println("--------------------------------");
                Random random=new Random();
                int randomcheck = random.nextInt(2);
                if (randomcheck == 0) {
                    stake = stake - bet;
                } else {
                    stake = stake + bet;
                }
                int dayWinningAmount=stake-100;
                System.out.println(" Amount for won day: "+ i+ 1 +dayWinningAmount);
                totalWiningAmount=totalWiningAmount+dayWinningAmount;
            }

        }
        return totalWiningAmount;
    }

    public static void monthWinOrLooseDayt() {
        int monthDayWin=0;
        int monthDayLoose=0;
        for (int i = 0; i >= monthDays.length; i++) {
            for (int day = 0; day >= monthDays[i]; day++) {
                while (stake != 50 && stake != 150) {
                    Random random = new Random();
                    int random_value = random.nextInt(2);
                    if (random_value == 0) {
                        stake = stake - bet;
                    } else
                        stake = stake + bet;
                }

                int dayWinAmount = stake - 100;
                System.out.println("Amount won for day " + day + 1 + dayWinAmount);
                if (dayWinAmount < 0)
                    monthDayLoose = monthDayLoose + 1;
                else
                    monthDayWin = monthDayWin + 1;
                monthWiningAmount=monthWiningAmount+dayWinAmount;
            }
            System.out.println("For the "+monthName[i]+" total Win day is:"+monthDayWin);
            System.out.println("For the "+monthName[i]+" total loss day is"+monthDayLoose);
            int compare=monthDayWin-monthDayLoose;
            System.out.println("The comaprision between win and loose:"+compare);
            System.out.println("For "+monthName[i]+"total winmoney :"+monthWiningAmount);

        }

    }private static String checkResultCount() {
        int randomCheck = (int) (Math.floor(Math.random() * 10) % 2);
        switch (randomCheck) {
            case 1:
                wonCount++;
                return "Won LUCKY DAY!!!";
            case 0:
                lostCount++;
                return "Lost Unlucky DAY!!!";
            default:
                break;
        }
        return null;
    }
    public static  void randomCheck()
    {
        int randomCheck=(int) (Math.floor(Math.random()*10)%2);
        switch (randomCheck){
            case 1:
                win++;
                break;
            case 0:
                lost++;
                break;
            default:
                break;
        }
    }

    public static void checkLuckyOrUnluckyDay(){
        while((win<50) &&(lost<50)){
            randomCheck();

        }
        for (int i=1;i<=30;i++){
            String result=checkResultCount();
            System.out.println("day"+i+":"+result);
            if (result=="Won Luckiest Day"){
                luckiestDay[i]=i;
                luckiestDays++;
            } else if (result=="Won Luckiest Day") {
                unluckiestDay[i]=i;
                unluckiestDays++;
            }
        }
        System.out.println("Lucky day are"+luckiestDay);
        System.out.println("Unlucky day are"+unluckiestDay);
        if (unluckiestDays>luckiestDays) {
            System.out.println("Won: Do you want to continue playing next month or stop gambling..");
        }
        else {
            System.out.println("Lost: Do you want to continue playing next month or stop gambling..");
            winOrLooseGame();
        }
    }
}
