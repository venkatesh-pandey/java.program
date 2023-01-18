package com.venkatesh;

import java.util.Scanner;

public class swapTwoNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter First Number :-");
    int a=scn.nextInt();
        System.out.print("Enter Second Number :-");
    int b=scn.nextInt();
        System.out.println("Before Swap the Number is:- A = "+a+" and "+" B = "+b);
        int c=a;
            a=b;
            b=c;
        System.out.println("After  Swap the Number is:- A = "+a+" and "+" B = "+b);
}
}
