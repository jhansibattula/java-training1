package com.trimindtech.training.day4;

public class Homerunner {
    public static void main(String[] args) {
        Home2 building1 =new Home2("appartment",'A',68000,3);
        //System.out.println(building1.toString());
        Home2  building2 = new Home2("small",'B',7000,4);
        Home2 building3 = new Home2("big",'c',8000,4);//

        Home2[]  myarrey =  new Home2[3];
        myarrey[0]=building1;
        myarrey[1] =building2;
        myarrey[2] =building3;
        for(int i =0;i<3;i++) {


            System.out.println(myarrey[i]);

        }
    }
}
