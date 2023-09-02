package one00DaysPrograme;

import java.util.Scanner;

public class Sum_Of_Numbers_in_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Words and Numbers:");
        String str1 = sc.nextLine();
        int sum=0;
        for (int i=0; i<str1.length(); i++){
            if (Character.isDigit(str1.charAt(i))){
                sum=sum+Character.getNumericValue(str1.charAt(i));
            }
        }
        System.out.println("Sum of Numbers in String:"+sum);
    }
}
