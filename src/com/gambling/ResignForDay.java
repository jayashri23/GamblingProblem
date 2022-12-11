package com.gambling;
import java.util.Random;
   public class ResignForDay {
       public ResignForDay(){
           System.out.println("Welcome to gambling simulation programs:");
           System.out.println();
           System.out.println("Gambler start games..");
       }
        final   int bet = 1;
        final   int stakePerDay = 100;
        final  double percentage = 0.5;
        static   int totalStake =0;
        static  int highestStake ;
        static int lowestStake;
        static  Random random = new Random();
    public static void main(String[] args) {
        ResignForDay gambling = new ResignForDay();
        System.out.println("Gambler every day stake is :" + gambling.stakePerDay);
        System.out.println("Bet is " + gambling.bet);
        startGambling(gambling);
    }
    public static void startGambling(ResignForDay gambling){

         totalStake =totalStake + gambling.stakePerDay;
         System.out.println(gambling.percentage);
         highestStake =(int )(totalStake+ (totalStake * gambling.percentage));
         lowestStake =(int )(totalStake+ (totalStake * gambling.percentage));

        totalStake =checkingCondition(gambling,random,totalStake,highestStake,lowestStake);
        System.out.println("Gambling resign for the day");
        System.out.println("Amount remaining at gambling is :" +totalStake);
    }
        public static  int checkingCondition(ResignForDay gambling,Random random, int totalStake ,
                                              int highestStake,int lowestStake) {
            while (totalStake != highestStake && totalStake != lowestStake)
            {
                int bet = random.nextInt(2);
                switch (bet) {
                    case 1:
                    System.out.println("Gambler win the bet");
                    totalStake = totalStake + gambling.bet;
                    break;
                    default:
                    System.out.println("Gambler loose the bet");
                    totalStake = totalStake - gambling.bet;
                    break;
                }
            }return totalStake;
        }
   }