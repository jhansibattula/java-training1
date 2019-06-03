package com.trimindtech.training.day2;

import java.util.Scanner;

public class switccasehappy {
    public static void main(String[] args) {
        System.out.println("enter two numbers");
        Scanner scanner =new Scanner(System.in);
        int x =scanner.nextInt();
        int y =scanner.nextInt();
        System.out.println("for addition enter 1");
        System.out.println("for subtraction enter 2");
        System.out.println("for mult enter 3");
        System.out.println("for devision enter 4");
        int key =  scanner.nextInt();

        switch(key){
            case 1:
            System.out.println("addition of "+x+"and "+y+"is  "+(x+y));
            break;
            case 2:
                System.out.println("subtraction of "+x+"and "+y+" is" +(x-y));
                break;
            case 3:
                System.out.println("mult of "+x+" and "+y+" is"+(x*y) );
                break;
            case 4:
                System.out.println("dev of "+x+" and "+y+" is"+(x/y));
                break;
            default:
                System.out.println("not identified");







        }



    }
}
