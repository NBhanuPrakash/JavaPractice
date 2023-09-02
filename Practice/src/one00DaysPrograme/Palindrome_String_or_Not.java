package one00DaysPrograme;

import java.util.Scanner;

public class Palindrome_String_or_Not {
    static boolean palindrome(String str1){
        int i=0;
        int j=str1.length()-1;
        while (i<j){
            if (str1.charAt(i)!=str1.charAt(j))
                return false;
                i++;
                j--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word:");
        String str1 = sc.nextLine();
        if (palindrome(str1)){
            System.out.println("It is a palindrome:"+str1);
        }
        else {
            System.out.println("It's not a Palindrome:"+str1);
        }
    }
}
