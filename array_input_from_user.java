package com.venkatesh;
import java.util.Scanner;
public class array_input_from_user {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please Enter Array size:-");
        int size = scn.nextInt();
        int[] arr = new int[size];
        {
            for (int i = 0; i <size; i++) {
                System.out.println("Enter the Value:- ");
                arr[i] = scn.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println("You are Entered this:-" + arr[i]);
            }
        }
    }
}
