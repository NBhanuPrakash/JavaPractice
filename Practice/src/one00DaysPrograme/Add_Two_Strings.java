package one00DaysPrograme;

import java.util.Scanner;

public class Add_Two_Strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name:");
        String str1 = sc.nextLine();
        System.out.println("Enter the Secound Name:");
        String str2 = sc.nextLine();
        String str3 = str1.concat(str2);
        System.out.println("Concatination of two words:"+str3);
    }
}
