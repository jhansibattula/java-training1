package com.trimindtech.training.day2;

import java.util.Scanner;

public class Room2 {
    public static void main(String[] args) {
        System.out.println("enterlengthandwidth");
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y =scanner.nextInt();
        int area = X*Y;
        System.out.println(area);




    }
}
