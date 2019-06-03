package com.trimindtech.training.day4;

public class Employee {
    private int age;
    private int experiance;
    private double salary;




    public Employee(int age, int experiance, double salary) {

        this.age = age;
        this.experiance = experiance;
        this.salary = salary;

    }

    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }

    public int getExperiance() {
        return experiance;
    }

    public void setExperiance(int experiance) {
        this.experiance = experiance;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
