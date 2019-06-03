package com.trimindtech.training.day2;

public class ArrayIterationLarger {
    public static void main(String[] args) {
        int[] myarray = {1, 2, 3, 4, 5};
        for (int num : myarray) {
            int larger = Integer.MIN_VALUE;
            if (num >  Integer.MIN_VALUE) {
                larger = num;
                System.out.println("the larger value is " + num);

            } else if (num < Integer.MIN_VALUE) {
                larger = Integer.MIN_VALUE;
                System.out.println("the larger value is " + Integer.MIN_VALUE
                );
            }
        }
    }
}
