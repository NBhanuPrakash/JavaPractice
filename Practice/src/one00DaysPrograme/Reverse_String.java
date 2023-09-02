package one00DaysPrograme;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        String str1 = sc.nextLine();
        StringBuilder str2 = new StringBuilder();
        for (int i=str1.length()-1; i>=0; i--){
            str2.append(str1.charAt(i));
        }
        System.out.println("Reverse String:"+str2);
    }
}
