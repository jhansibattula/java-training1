package com.trimindtech.training.day2;

import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {
        System.out.println("enter a value");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();


        if (x % 2 == 0 && x % 3 == 0) {
            System.out.println("say hellow world");
        }
         else  if(x % 2 == 0){
            System.out.println("say hellow");
        }
          else if (x% 3 == 0) {
            System.out.println("say world");
        }
    }
}
