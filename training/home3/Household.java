package com.trimindtech.training.home3;


public class Household {
    public Household(int occupents1, double salary1) {
        this.occupents = occupents1;
        this.salary = salary1;
    }

    public Household(int occupents2, int salary2) {
        this.occupents = occupents2;
        this.salary = salary2;
    }

       public Household(int occupents3,float salary3){
        this.occupents = occupents3;
        this.salary = salary3;


        }

        private int occupents;
        private double salary;
        public void printthedetails () {
            System.out.println(this.occupents);
            System.out.println(this.salary);
        }
        public void calAvgIncome(){
            double calAvgIncome =salary/occupents;
            System.out.println(calAvgIncome);
        }

    }
