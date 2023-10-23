package com.java.training;

public class ArraysDemo {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        for (int i:arr) {
            System.out.println("the value is" +i);
        }

        String[] cars = {"Honda", "BMW", "Ford", "Tesla"};
        cars[0] = "Acura";
        System.out.println("Car length is:" + cars.length);
        System.out.println("ArrayList:");
        for (int i = 0; i < cars.length; i++)
            System.out.println(cars[i]);
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        System.out.println("Array Length: " + myNumbers.length);
        for (int i = 0; i < myNumbers.length; ++i) {
            System.out.println(myNumbers[i].length);
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
