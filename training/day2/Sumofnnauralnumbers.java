package com.trimindtech.training.day2;

import java.util.Scanner;

public class Sumofnnauralnumbers {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum=0;
        int i=1;
        while(i<=num){
            sum = sum + i;

            i++;
        }
        System.out.println(sum);



    }
}
