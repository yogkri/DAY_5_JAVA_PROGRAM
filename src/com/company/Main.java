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

        System.out.println("The swap value of a is : " + a);
        System.out.println("The swap value of b is : " + b);

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a number to check even or odd : ");
        int num = sc1.nextInt();
        if (num % 2 == 0){
            System.out.println(num + " : is an even number");
        }
        else {
            System.out.println(num + " : is an odd number");
        }
    }
}

