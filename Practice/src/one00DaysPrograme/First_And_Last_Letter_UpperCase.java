package one00DaysPrograme;

import java.util.Scanner;

public class First_And_Last_Letter_UpperCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Words:");
        String str1 = sc.nextLine();
        StringBuilder str2 = new StringBuilder();
        String[] str3 = str1.split("\\s");
        for (String str4:str3){
            int str = str4.length();
            String first = str4.substring(0,1);
            String r = str4.substring(1,str-1);
            String Last = Character.toString(str4.charAt(str-1));
            str2.append(first.toUpperCase()).append(r).append(Last.toUpperCase());
        }
        System.out.println(str2);

    }
}
