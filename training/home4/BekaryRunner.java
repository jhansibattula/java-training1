package com.trimindtech.training.home4;

import java.util.Scanner;

public class BekaryRunner {
    public static void main(String[] args) {


        Bekary masala = new Bekary();
        System.out.println(masala.toString());
        //masala.pricedetail();
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the cake flavour");

        int x = scanner.nextInt();
        if(x==1){
            System.out.println("chocolate moist");}
        if(x==2){

            System.out.println("strawberry ");}
        if (x==3){

            System.out.println("blueberry ");}
        if ((x==4)){

            System.out.println(" cheesy cake");
        }

        System.out.println("entre the waight of the cake");
        int y = scanner.nextInt();
        System.out.println("enter the quantity added");
        int z = scanner.nextInt();




      }
    }

