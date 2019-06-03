package com.trimindtech.training.Home5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DvdRunner {
    public static void main(String[] args) {
        Dvd d1 = new Dvd("iron man", 3.5);
        Dvd d2 = new Dvd("death note", 2.5);
        Dvd d3 = new Dvd("shrek", 2);
        Dvd d4 = new Dvd("transformers", 3.25);
        Dvd d5 = new Dvd("the eye", 3);
        Dvd d6 = new Dvd("fantastic 4", 4);

        Map<String,Dvd> dvdMap =new HashMap<>();
        dvdMap.put("iron man",d1);
        dvdMap.put("death note",d2);
        dvdMap.put("shrek",d3);
        dvdMap.put("transformers",d4);
        dvdMap.put("the eye",d5);
        dvdMap.put("fantastic 4",d6);

        System.out.println("enter the movie name");
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
         if(!dvdMap.containsKey(movieName)){

             System.out.println("dvd is not available");
             return;
         }
             Dvd dvd = dvdMap.get(movieName);



        System.out.println("a.returning a Dvd\t b.returning a Dvd\t c.printing the details of the Dvd\t d.exit");
        char choice = scanner.next().charAt(0);

        switch (choice){
            case 'a':
                if(dvd.getMovieStatus() ==MovieStatus.IN)
            {
                System.out.println("renting the dvd" +dvd.toString());
                dvd.setMovieStatus(MovieStatus.OUT);

            }
                else{
                System.out.println("it is already renyed");
            }
                break;
            case 'b':
                dvd.setMovieStatus(MovieStatus.IN);
                System.out.println("added to inventory" +dvd.toString());
                break;
            case 'c':
                for(String movietitle: dvdMap.keySet()){
                    System.out.println(dvdMap.get(movietitle).toString());

                }
                break;

            case 'd':
                break;




    }
        System.out.println("thanks for visiting");




    }
}
