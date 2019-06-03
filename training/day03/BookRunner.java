
package com.trimindtech.training.day03;

public class BookRunner {
    public static void main(String[] args) {
        Book java = new Book("jhansi",499.0,250,15,"teest");
        java.printParamenters();

        Book cpp = new Book("nani",300,500,6,"samsung");
        cpp.printParamenters();



        Book html = new Book();
        html.author="shobha";
        html.cost= 200;
        html.edition = 7;
        html.publisher = "mi";
        printBooDetails(html);
    }
    public static void printBooDetails(Book properties){
        System.out.println(properties.author);
        System.out.println(properties.cost);
        System.out.println(properties.edition);
        System.out.println(properties.publisher);
    }

}
