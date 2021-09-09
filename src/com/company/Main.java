package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char character;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        character = scanner.next().charAt(0);
        switch (character) {
            case 'a':
                System.out.println(character + " : is an Vowel");
                break;
            case 'e':
                System.out.println(character + " : is an Vowel");
                break;
            case 'i':
                System.out.println(character + " : is an Vowel");
                break;
            case 'o':
                System.out.println(character + " : is an Vowel");
                break;
            case 'u':
                System.out.println(character + " : is an Vowel");
                break;
            case 'A':
                System.out.println(character + " : is an Vowel");
                break;
            case 'E':
                System.out.println(character + " : is an Vowel");
                break;
            case 'I':
                System.out.println(character + " : is an Vowel");
                break;
            case 'O':
                System.out.println(character + " : is an Vowel");
                break;
            case 'U':
                System.out.println(character + " + : is an Vowel");
                break;
            default:
                System.out.println(character + " : is an Consonent");


                int number1, number2, number3;
                System.out.println("We have to check largest among these three numbers below ");
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter First number : ");
                number1 = sc.nextInt();
                System.out.print("Enter Second number : ");
                number2 = sc.nextInt();
                System.out.print("Enter Third number : ");
                number3 = sc.nextInt();
                //
                if (number1 > number2 && number1 > number3) {
                    System.out.println(number1 + "  is largest in " + number1 + "," + number2 + "," + number3);
                } else if (number2 > number1 && number2 > number3) {
                    System.out.println(number2 + "  is largest in " + number1 + "," + number2 + "," + number3);
                } else {
                    System.out.println(number3 + "  is largest in " + number1 + "," + number2 + "," + number3);
                }
        }
    }
}

