package com.company;
import java.util.Scanner;


public class Main {

    static final int MAX_VALUE = 32;
    static final int MIN_VALUE = 0;

    public static void main(String[] args) {

        int number;
        int power;
        System.out.print("Enter a number to Print 2 power Table : ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        if (number >= MIN_VALUE && number < MAX_VALUE) {
            for (int i = 0; i < number; i++) {
                power = (int) Math.pow(2, i);
                System.out.println("2" + "^" + i + "=" + power);
            }
        }
    }
}



