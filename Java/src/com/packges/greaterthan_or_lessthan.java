package com.packges;


import java.util.Scanner;

public class greaterthan_or_lessthan{

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
         int num1 = scan.nextInt();
         int num2 = scan.nextInt();

        if (num1 >= num2) {
            System.out.println("num1 is greater than num2");
        } else {
            System.out.println("num2 is greater than num1");
        }

         if (num1==num2)
        {
            System.out.println("num1 is equal to num2");
        }
        else
        {
            System.out.println("num2 is equal to num1");
        }
    }
}
