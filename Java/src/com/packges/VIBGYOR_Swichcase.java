package com.packges;


import java.util.Scanner;

public class VIBGYOR_Swichcase
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("VIBGYOR Spectrum");
        System.out.println("Enter your colour choice: ");
        char choice = in.next().charAt(0);

        switch (choice) {
            case 'V' -> System.out.println("Violet");
            case 'I' -> System.out.println("Indigo");
            case 'B' -> System.out.println("Blue");
            case 'G' -> System.out.println("Green");
            case 'Y' -> System.out.println("Yellow");
            case 'O' -> System.out.println("Orange");
            case 'R' -> System.out.println("Red");
            default -> System.out.println("Incorrect choice");
        }
    }
}
