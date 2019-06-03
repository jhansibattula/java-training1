package com.trimindtech.training.day2;

import java.util.Scanner;

public class Numberbtwnoneandhundred {
    public static void main(String[] args) {
        System.out.println("enter a value");
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        if( (r>1) && (r<100)){
            System.out.println("the value is in the range");
        }
    }
}
