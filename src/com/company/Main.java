package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Float harmonicNumber = 1f;
        int number;
        System.out.print("Enter the number to Check Harmonic expression (1+ 1/2 + 1/3 + ....+ 1/N) : ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        if (number != 0) {
            for (int i = 2; i <= number; i++) {
                System.out.println("i value:" + i);
                harmonicNumber += (float) 1 / i;
                System.out.println(harmonicNumber);

                Scanner scan = new Scanner(System.in);
                System.out.print("Input a number: ");
                int number1 = scan.nextInt();
                if (number > 0) {
                    while (number % 2 == 0) {
                        System.out.print(2 + " ");
                        number /= 2;
                    }

                    for (int i1 = 3; i <= Math.sqrt(number); i += 2) {
                        while (number % i == 0) {
                            System.out.print(i + " ");
                            number /= i;
                        }
                    }
                    if (number > 2)
                        System.out.print(number);
                }
            }
            System.out.print("Harmonic Value of Number " + number + " is :  " + harmonicNumber);
        }
    }
}
