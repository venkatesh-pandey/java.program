package com.venkatesh;

import java.util.Scanner;

public class Factorial_number {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int fact=1;
        System.out.print("Enter a Number You Want to Check :-");
        int n=scn.nextInt();
        for(int i=1; i<=n;i++)
            fact=fact*i;
        System.out.println("The Factorial Number of "+n+" is = "+fact);

    }
}
