package com.java.training;

public class StringDemo {

    public static void main(String[] args) {
        System.out.println("Hello");
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
        int arr[]={1,2,3,4};
        for (int i:arr) {
            System.out.println("the value is" +i);
        }

        }
}

