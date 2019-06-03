package com.trimindtech.training.day2;

public class Arreybasic {
    public static void main(String[] args) {


        int[] myarrey = {1, 2, 3, 4, 5};
        int i;
int sum = 0;
        for (i = 0; i < myarrey.length; i++) {
            sum=sum+myarrey[i];
        }
        System.out.println(sum);
    }
}
