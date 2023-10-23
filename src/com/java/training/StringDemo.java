package com.java.training;

public class StringDemo {

    public static void main(String[] args) {
        System.out.println("Hello");
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("locate"));
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
    }
}

