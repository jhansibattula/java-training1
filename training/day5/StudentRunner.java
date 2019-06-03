package com.trimindtech.training.day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {

        Student[] student = new Student[5];
        ;
        System.out.println("enter the student age");
        Scanner scanner = new Scanner(System.in);
        int age;
        try {
            age =scanner.nextInt();

        }
        catch (InputMismatchException exception) {


            System.out.println("enter the integer values");
            return;
        }

        String name = scanner.next();

        System.out.println( age);

        Student student1 = new Student("jhansi","01");
        Student student2 = new Student("nani", "02");
        Student student3 = new Student("shobha", "03");
        Student student4 = new Student("omi", "04");
        Student student5 = new Student("sam", "05");

        student[0] = student1;
        student[1] = student2;
        student[2] = student3;
        student[3] = student4;
        student[4] = student5;


        Student[] students = {student1, student2, student3, student4, student5};
        System.out.println(studentexists(students,student4));
    }

    public  static boolean studentexists(Student[ ] existingstudents,Student newstudent) {
        for (Student student : existingstudents) {
            if (student.equals(newstudent)) {
                return true;
            }


        }
        return false;
    }
    }


