package com.trimindtech.training.day2;

import java.util.Scanner;

public class greaternumber {
    public static void main(String[] args) {
        System.out.println("enter two numbers");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        //int greater = x>y? x:y;
      //  System.out.println(greater);
        System.out.println((x > y ? x : y));

    }

}
