package com.trimindtech.training.day2;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Againdowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int sum = 0;
        do {
            System.out.println("enter the  numbers");
            i = scanner.nextInt();
            sum =i+sum;

        }while(i!=0);
        System.out.println(sum);
    }

}
