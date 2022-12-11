package com.gambling;
import java.util.Random;

public class TotalWinOrLoose {
    public void Total() {
        int day = 20;
        int stake = 100;
        int win = 0;
        int loose = 0;
        int cnt = 1;
        while (cnt <= day) {
            int numDays = cnt;
            System.out.println("Day= " + numDays);
            for (int i = 0; i < stake; i++) {
                Random rand = new Random();
                int check = rand.nextInt(2);
                if (check == 1) {
                    win++;
                } else {
                    loose++;
                }
            }
            System.out.println("Win = " + win);
            System.out.println("Lost= " + loose);
            cnt++;
        }
        System.out.println("Total Win =" +win);
        System.out.println("Total Lost =" +loose);
    }
    public static void main(String [] args){
            System.out.println("20 Days Playing Amount Win Or Lost Every Day:");
            TotalWinOrLoose tot = new TotalWinOrLoose();
            tot.Total();
        }
    }


