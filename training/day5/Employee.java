package com.trimindtech.training.day5;

public class Employee {
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    private  String name;
    private int id;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        Employee employee =(Employee)obj;
        boolean namematch = this.getName().equals(employee.getName());
        boolean idmatch = this.getId()==(employee.getId());
        boolean salarymatch = this.getSalary()==(employee.getSalary());
        return namematch && idmatch && salarymatch;


    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
