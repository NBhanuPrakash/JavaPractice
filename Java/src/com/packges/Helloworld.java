package com.packges;

import java.util.Scanner;


    class HelloWorld {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the name");
            String person = scan.nextLine();
            System.out.println("Enter the PH.NO");
            int number = scan.nextInt();
            System.out.println("Enter the village");
            scan.nextLine();
            String villagestring = scan.nextLine();

            System.out.println("Hello" + person);
            System.out.println("number");
            System.out.println("villagestring");
        }
    }