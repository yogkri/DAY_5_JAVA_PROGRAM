package com.company;


import java.util.Scanner;
public class Main {

    static final int HEADFLIP = 1;
    static final int COUNT = 100;

    public static void main(String[] args) {


                String leapYearCheck;
                System.out.print("Enter Year to Check it LeapYear or not : ");
                Scanner scanner = new Scanner(System.in);
                leapYearCheck = scanner.nextLine();

                if (leapYearCheck.length() == 4) {

                    int leapYear = Integer.parseInt(leapYearCheck);
                    System.out.println("Entred year is : " + leapYear);
                    if ((leapYear % 4) == 0 && (leapYear % 100) != 0 || (leapYear % 400) == 0) {
                        System.out.println(leapYear + " is a LeapYear");
                    } else {
                        System.out.println(leapYear + " is not a LeapYear");
                    }

                } else {
                    System.out.println("Invalid Year! Enter an valid Year of 4 digit ");
                }
            }
        }



