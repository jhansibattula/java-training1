package com.trimindtech.training.day2;

import java.util.Scanner;

public class Oddoreven {
    public static void main(String[] args) {
        System.out.println("enter a numbers");
        Scanner scanner = new Scanner(System.in);
        int x =scanner.nextInt();
        System.out.println((x%2==0?"even":"odd"));

    }
}
