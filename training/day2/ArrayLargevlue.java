package com.trimindtech.training.day2;

public class ArrayLargevlue {
    public static void main(String[] args) {
        int[] myarray = {1, 2, 3, 4,5};
        int i = 0;
        for (i = 0; i <=myarray.length; i++) ;
        int larger = myarray[4];


        if (myarray[i] <larger) {


            System.out.println("larger value is" +larger);

        }
        else if(myarray[i]>larger){
            larger = +larger;

            System.out.println("larger value is " +myarray[i]);
        }
    }
}

