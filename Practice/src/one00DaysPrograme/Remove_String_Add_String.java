package one00DaysPrograme;

import java.util.Scanner;

public class Remove_String_Add_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  Words:");
        String str1 = sc.nextLine();
        System.out.println("Enter the SubWords in the removed:");
        String str2 = sc.nextLine();
        System.out.println("Enter the NewWords:");
        String str3 = sc.nextLine();
        String newStr = str1.replace(str2,str3);
        System.out.println("Generate the new Words:"+newStr);
    }
}
