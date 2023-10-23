package com.java.training;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("testing");
        System.out.println("Hello world!");
        int x = 5;
        if (x < 10){
            System.out.println("X is lessthan 10");
        }
        else
            System.out.println("x is greater");
        for(int y=0;y<5;y++){
            System.out.println("y is" +y);
        }
        int a=1;
        while (a<10){
            a++;
            if(a==5){
                break;
            }
            System.out.println("a is" +a);
        }

        int num=8;
        System.out.print("Multiplication Table:");

        for (int i = 0; i <10; i++) {
            System.out.println(8 + " x " + (i + 1) + " = " +
                    (8 * (i + 1)));
        }
    }
}