package one00DaysPrograme;


import java.util.Scanner;

public class UpperCase_LowerCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word:");
        String str1 = sc.nextLine();
        String str2 = "";
        for (int i=0; i<str1.length(); i++){
            if (Character.isLowerCase(str1.charAt(i))) {
                str2 = str2+Character.toUpperCase(str1.charAt(i));
            } else {
                str2 = str2+Character.toLowerCase(str1.charAt(i));

            }
        }
        System.out.println("String Exchanger:"+str2);
    }
}
