package com.LickingHeights;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

//        testOddness();

//        keepContained();

        lastDigit();

    }

    public static void testOddness() {

        int number;

        Scanner keyboard;

        keyboard = new Scanner(System.in);

        System.out.println("This number is: ");

        number = keyboard.nextInt();

        System.out.println("Number is odd: " + (number % 2 != 0));

    }

    public static void keepContained() {

        int number;

        Scanner keyboard;

        keyboard = new Scanner(System.in);

        System.out.println("Give me a positive number: ");

        number = keyboard.nextInt();

        System.out.println("Number contained is: " + ((number%8)+5));

        }


    public static void lastDigit() {

        int number;

        Scanner keyboard;

        keyboard = new Scanner(System.in);

        System.out.println("Give me a number with 4 digits");

        number = keyboard.nextInt();

        System.out.println("Last Digit of " + number + " is: " + number%10);

    }
}
