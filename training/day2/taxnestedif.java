

package com.trimindtech.training.day2;

import java.util.Scanner;

public class taxnestedif {

    public static double calculateTaxForSingle(double salary) {
        double tax = 0.0;
        if(salary<=6000)
        {
            tax = 10.0;
        }
        else if (salary>6001 && salary<27950){
            tax = 15.0;

        }
        else if (salary>27951 && salary<67700){
            tax = 27.0;

        }
        return tax;

    }
    public static double calculateTaxFormarriedjoint(double salary){
        double tax =0.0;
        if (salary<12000){
            tax =10.0;

        }
        else if (salary>12001 && salary<46700){
            tax = 15.0;
        }
        else if (salary>46701 && salary<59440){
            tax = 27.0;
        }
            return tax;



    }
    public static double calculateTaxFormarriedSeperate(double salary) {
        double tax = 0.0;

        if (salary < 6000) {
            tax = 10.0;


        } else if (salary > 6001 && salary < 23350) {
            tax = 15.0;
        }
        else if (salary > 23351 && salary < 56425) {
            tax = 27.0;


        }
return tax;


    }
    public static  double calculateTaxForHouseHolder(double salary){
        double tax =0.0;
        if (salary<10000){
            tax=10.0;


        }
        else if(salary>10001 &&salary<37450){
            tax = 15.0;

        }
        else if (salary>37451 && salary<96700){
            tax = 27.0;
        }

return tax;
    }




    public static void main(String[] args) {
        System.out.println("enter the filer");
        Scanner scanner = new Scanner(System.in);
        int filer =scanner.nextInt();
        System.out.println("enter the salary");
        double salary = scanner.nextDouble();
        double tax = 0.0;
        switch (filer){
            case 1:
                tax = calculateTaxForSingle(salary);
                break;
            case 2:
                    tax =calculateTaxFormarriedjoint(salary);
                    break;
            case 3:
                tax = calculateTaxFormarriedSeperate(salary);
                break;
            case 4:
                tax = calculateTaxForHouseHolder(salary);
                break;


        }
        System.out.println("tax is "+tax);
        }





    }




