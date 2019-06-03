package com.trimindtech.training.day2;

import java.util.Scanner;

public class Forloopcirclearea {
    public static void main(String[] args) {
        System.out.println("enter the radius");
        Scanner scanner = new Scanner (System.in);
        int radius = scanner.nextInt();
        int i;
        int area;

        for (i=radius;i<10;i++);
        {
         area = 22/7*radius*radius;
            System.out.println(area);
        }


    }

}
