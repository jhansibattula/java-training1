package com.trimindtech.training.day5;

public class Student {
     private  String name;
     private String idno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student)obj;
        boolean namematched = this.getName().equals(student.getName());
        boolean idmatched = this.getIdno().equals(student.getIdno());
        return namematched && idmatched;

    }

    public Student(String name, String idno) {
        this.name = name;
        this.idno = idno;
    }



}
