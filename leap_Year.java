package com.venkatesh;

import java.util.Scanner;

public class leap_Year {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year;
        System.out.println("Enter a YEAR :-");
        year = scn.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else if (year % 100 == 0) {
            System.out.println(year + " is Not a Leap Year.");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");

        }
    }
}