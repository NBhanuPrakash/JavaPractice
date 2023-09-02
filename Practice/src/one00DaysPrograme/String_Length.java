package one00DaysPrograme;

import java.util.Scanner;

public class String_Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentance");
        String str1 = sc.nextLine();
        char[] ch = str1.toCharArray();
        int i=0;
        for (char ignored : ch){
            i++;
        }
        System.out.println("String length:"+i);


    }
}
