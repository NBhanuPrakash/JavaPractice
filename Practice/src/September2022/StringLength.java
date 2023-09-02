package September2022;

import java.util.Scanner;

public class StringLength {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.nextLine();
        System.out.println(s);
        String S1 = new String(s);
        System.out.println(S1);

        System.out.println(S1.length());

        System.out.println(S1.indexOf("0"));

        System.out.println(S1.toUpperCase());

        System.out.println(S1.toLowerCase());

    }
}
