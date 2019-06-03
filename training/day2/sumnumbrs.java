package com.trimindtech.training.day2;

import java.util.Scanner;

public class sumnumbrs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i;
        do{
            System.out.println("enter the values");
            i =scanner.nextInt();
             sum = i+sum;
        }while(i != 0);
    }
}
