package com.trimindtech.training.day2;

import java.util.Scanner;

public class happy {
    public static void main(String[] args) {
        System.out.println("enter two numbers");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("for addution 1");
        System.out.println("for subtraction 2");
        System.out.println("for devision 3");
        System.out.println("for modulo devision 4");
        System.out.println("for multiplication 5");
        int operater = scanner.nextInt();
        if (operater == 1) {
            System.out.println(" addition of " + x + " and " + y + " is " + (x + y));

        } else if (operater == 2) {
            System.out.println("subtraction of " + x + " and " + y + " is " + (x - y));
        } else if (operater == 3) {
            System.out.println("devision of " + x + " and " + y + " is " + (x / y));
        } else if (operater == 4) {
            System.out.println("modulo devison of " + x + " and " + y + " is " + (x % y));


        } else if (operater == 5) {
            System.out.println("multiplication of " + x + " and " + y + " is" + (x * y));
        }


    }
}














