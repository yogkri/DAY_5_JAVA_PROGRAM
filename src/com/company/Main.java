package com.company;

import java.util.Random;
public class Main {

    static final int HEADFLIP = 1;
    static final int COUNT = 100;

    public static void main(String[] args)  {

        double heads = 0;
        double tails = 0;
        for (int i = 1; i <= COUNT; i++) {
            //for getting Randoms number draw between 0 or 1
            Random random = new Random();
            int coin = random.nextInt(2);
            if (coin == HEADFLIP) {
                System.out.println("Head");
                heads += 1;
            } else {
                System.out.println("Tail");
                tails += 1;
            }
        }
        System.out.println("percentage of Heads : " + ((heads / COUNT) * 100) + "%");
        System.out.println("percentage of Tails : " + ((tails / COUNT) * 100) + "%");
    }

}