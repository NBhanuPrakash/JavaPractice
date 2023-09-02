package August2022;

import java.util.Scanner;

public class Alphabets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the words:");
        char s = sc.next().charAt(0);
        if ((s>='A' && s<='Z') || (s>='a' && s<='z'))
        {
            System.out.println("Alphabets");
        }
        else {
            System.out.println("Its not alphabets:");
        }
    }
}
