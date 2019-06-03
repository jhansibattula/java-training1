package com.trimindtech.training.day4;

public class Manager extends Employee {


    private double bonus;


    public Manager(int age, int experiance, double salary, double bonus) {
        super(age, experiance, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }


    public void setBonus(double bonus) {
        this.bonus = bonus;
    }




    @Override
    public double getSalary() {

        return super.getSalary()+bonus;
    }

    @Override
    public String toString() {
        return getSalary()+"\n"+getAge()+"\n"+getExperiance();
    }




}
