package com.packges;

import java.util.Scanner;

public class stars {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = i; j <= n; j++)
            {
                System.out.print("  ");
            }
            for (int j = 1; j < n; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println("\n");
        }
    }
}


