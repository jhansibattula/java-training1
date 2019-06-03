package com.trimindtech.training.day2;

import java.util.Scanner;

public class overtimepay
{
    public static void main(String[] args) {
        System.out.println("enter pay hours");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double payrate;
        if(x<=40){
            payrate= x*1;
            System.out.println(payrate);
        }
        else if(x>40){
            payrate= (40*1)+((x-40)*1.5);
            System.out.println(payrate);
        }
    }
}
