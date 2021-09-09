package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            System.out.print("Input a number: ");
            int number = scan.nextInt();
            if (number > 0) {
                while (number % 2 == 0) {
                    System.out.print(2 + " ");
                    number /= 2;
                }

                for (int i = 3; i <= Math.sqrt(number); i += 2) {
                    while (number % i == 0) {
                        System.out.print(i + " ");
                        number /= i;
                    }
                }
                if (number > 2)
                    System.out.print(number);
            }
            int quotient, remainder, dividend, divisor;
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Dividend value : ");
            dividend = scanner.nextInt();

            System.out.print("Enter Divisor value : ");
            divisor = scanner.nextInt();

            quotient = dividend / divisor;
            remainder = dividend % divisor;
            System.out.println("Quotient = " + quotient);
            System.out.println("Remainder= " + remainder);
        }
    }

