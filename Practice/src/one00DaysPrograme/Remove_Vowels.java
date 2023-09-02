package one00DaysPrograme;

import java.util.Scanner;

public class Remove_Vowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word:");
        String str1 = sc.nextLine();
        String str2 = str1.replaceAll("[aeiou]","");
        System.out.println("Vowels Removing:"+str2);

    }

}
