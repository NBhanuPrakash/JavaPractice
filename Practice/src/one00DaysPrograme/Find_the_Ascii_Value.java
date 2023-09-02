package one00DaysPrograme;

import java.util.Scanner;

public class Find_the_Ascii_Value {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabets:");
        char alp = sc.next().charAt(0);
        System.out.println("Ascii value:"+ (int) alp);

    }
}
