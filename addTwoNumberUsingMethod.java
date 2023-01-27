package com.venkatesh;
import java.util.Scanner;
class main {
    static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
public class addTwoNumberUsingMethod {
    public static void main(String[] args) {
        main obj=new main();
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter First Number:-");
        int a=scn.nextInt();
        System.out.print("Enter Second Number:-");
        int b=scn.nextInt();
        System.out.print("Sum of input number is:-");
        int ans=obj.add(a,b);
        System.out.println(ans);

    }
}
