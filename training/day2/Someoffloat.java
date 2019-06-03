package com.trimindtech.training.day2;

public class Someoffloat {
    public static void main(String[] args) {
        double i=0.01;
        double sum =0.0;

        for(i=0.01;i<1.0;i =i+0.1){
            sum=i+sum;
        }
        System.out.println(sum);

    }
}
