package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

            int a, b;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of a : ");
            a = sc.nextInt();
            System.out.print("Enter the value of b : ");
            b = sc.nextInt();
            int t = 0;

            t = a;
            a = b;
            b = t;

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
        System.out.println("The swap value of a is : " + a);
        System.out.println("The swap value of b is : " + b);
        }
    }

