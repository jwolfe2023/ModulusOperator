package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        testOddness();

        int number;

        Scanner keyboard;

        keyboard = new Scanner(System.in);

        System.out.println("This number is: ");

        number = keyboard.nextInt();

        System.out.println("Odd: " + (number % 2 != 0));

        System.out.println("Even: " + (number % 2 == 0));


    }

    public static void testOddness() {




        }

}
