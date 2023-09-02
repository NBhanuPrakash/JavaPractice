package one00DaysPrograme;

import java.util.Scanner;

public class Remove_Brackets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers with brackets:");
        String str1 = sc.nextLine();
        String str2 = str1.replaceAll("[(){}]","");
        System.out.println("Removed Brackets:"+str2);

    }
}
