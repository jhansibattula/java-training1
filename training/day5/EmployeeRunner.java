package com.trimindtech.training.day5;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee company1 = new Employee("employee1",1001,10000.0);
        Employee company2 = new Employee("employee2",1002,10000);
        Employee company3 = new Employee("employee3",1003,10000);
        ArrayList<Employee> employee =new ArrayList();
        Set<Employee> employeeSet = new HashSet<>();

        employee.add(company1);
        employee.add(company2);
        employee.add(company3);

        Employee company4 = new Employee("employee3",1003,10000);
        System.out.println("noofempolyees"+employee.size());
        for(Employee sftwr : employee){
            System.out.println(sftwr.toString());

        }

        System.out.println(employee.contains(company4));




    }


}

