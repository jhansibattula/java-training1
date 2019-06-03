package com.trimindtech.training.day2;

import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        System.out.println("enter radius");
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        do{
            System.out.println("enter a positive number");
            r++;
        } while(r<0);


        float area =22/7*r*r;
        System.out.println(area);



    }
}
