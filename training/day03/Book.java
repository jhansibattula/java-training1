package com.trimindtech.training.day03;

public class Book {

    public Book(String author1,double cost1, int noofpages1, int edition1, String publisher1){
     this.author = author1;
     this.cost = cost1;
     this.noofpages = noofpages1;
     this.edition = edition1;
     this.publisher = publisher1;
    }

    public Book(){

    }

    public String author;
    public double cost;
    public int noofpages;
    public int edition;
    public String publisher;

    public void printParamenters(){
        System.out.println(this.author);
        System.out.println(this.cost);
    }
}
