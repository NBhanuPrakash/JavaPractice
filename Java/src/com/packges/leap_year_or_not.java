package com.packges;

import java.util.Scanner;

public class leap_year_or_not {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = scan.nextInt();
        if (num1%4==0 || num1%100==0 || num1%400==0)
        {
            System.out.println("it is a leap year");
        }
        else
        {
            System.out.println("it is not leap year");
        }

    }

}
