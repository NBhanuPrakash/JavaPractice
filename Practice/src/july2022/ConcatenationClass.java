package july2022;

import java.util.Scanner;

public class ConcatenationClass {
    public static void main(String[] args){
        String a ;
        String b ;
        Scanner scan = new Scanner(System.in);
        System.out.println("condline args concatenation:");
        a = scan.nextLine();
        b = scan.nextLine();
        String s = a+b;
        System.out.println("concatenation for two values:"+s);
    }
}
