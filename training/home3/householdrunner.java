package com.trimindtech.training.home3;

public class householdrunner {
    public static void main(String[] args) {
        Household mother =new Household(5,60000);
        Household father =new Household(3,45000);
       // Household brother =new Household()

        father.printthedetails();
        mother.printthedetails();
        //brother.printthedetails();

        father.calAvgIncome();
        mother.calAvgIncome();






    }
}
