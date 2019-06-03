package com.trimindtech.training.day2;

import java.util.Scanner;

public class Mailorderprob {
    public static void main(String[] args) {
        System.out.println("enter your product");
        Scanner scanner = new Scanner(System.in);
        int product = scanner.nextInt();
        switch (product){
            case 1:
                System.out.println("INR.298");
                break;
            case 2:
                System.out.println("INR.300");
                break;
            case 3:
                System.out.println("INR.364");
                break;
            case 4:
                System.out.println("INR.254");
                break;


        }
    }
}
