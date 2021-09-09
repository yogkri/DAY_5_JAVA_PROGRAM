package com.company;
import java.util.Scanner;
public class Main {


    static final int MAX_VALUE = 64;
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
               {

                    Float harmonicNumber = 1f;
                    int number1;
                    System.out.print("Enter the number to Check Harmonic expression (1+ 1/2 + 1/3 + ....+ 1/N) : ");
                    Scanner scanner1 = new Scanner(System.in);
                    number = scanner.nextInt();

                    if (number != 0) {
                        for (int i1 = 2; i <= number; i++) {
                            System.out.println("i value:" + i);
                            harmonicNumber += (float) 1 / i;
                            System.out.println(harmonicNumber);
                        }
                        System.out.print("Harmonic Value of Number " + number + " is :  " + harmonicNumber);
                    }
                }
            }
        }
    }
}
