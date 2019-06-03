package com.trimindtech.training.day2;

import java.util.Scanner;

public class Negitiveorpasstive {
    public static void main(String[] args) {
        System.out.println("entre a number");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println((x<0?"negitive":"passitive"));
    }
}
