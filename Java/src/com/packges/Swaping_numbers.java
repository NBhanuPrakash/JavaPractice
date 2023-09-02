package com.packges;

import java.util.Scanner;

public class Swaping_numbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = scan.nextInt();
        int b = scan.nextInt();

                a=a-b;
                b=b+a;
                a=b-a;
              
        System.out.println(a+" "+b);
    }
}
