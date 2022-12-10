package com.gambling;

import java.util.Random;

public class WinORLoose {
    public static void main(String[] args) {
        int bet =1;
        Random random =new Random();
        int check = random.nextInt(2);
        if (check == 1){
            System.out.println(" Gambler Win bet = " +bet);
        }else {
            System.out.println("Gambler Loose bet = " +bet);
        }
    }
}
