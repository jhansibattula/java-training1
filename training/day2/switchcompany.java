package com.trimindtech.training.day2;

import java.util.Scanner;

public class switchcompany {
    public static void main(String[] args) {
        System.out.println("select the plan");
        Scanner scanner = new Scanner(System.in);
        int plan =scanner.nextInt();
        switch (plan){
            case 1:
                System.out.println("the company pays for all");
                break;
            case 2:
                System.out.println("4.65");
                break;
            case 3:
                System.out.println("7.85");
                break;
            case 4:
                System.out.println("5.50");
                break;
            default:
                System.out.println("err0r");


        }


    }
}
