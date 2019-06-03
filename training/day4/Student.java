package com.trimindtech.training.day4;

public class Student {
     public String name;
     public  int age;
     public static  int objectcount;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        objectcount++;
//        System.out.println(objectcount++);
    }

}
