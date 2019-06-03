package com.trimindtech.training.home3;

public class Planet {
    public Planet(String name1,int noofdays1){
        this.name = name1;
        this.noofdays = noofdays1;
    }
    private String name;
    private int noofdays;

    public void printTheDetails(){
        System.out.println(this.name);
        System.out.println(this.noofdays);

    }
    public void calAge(){
        int age =1;
        int personage =(age*noofdays)/365;
        System.out.println(personage);
    }
}
