package july2022;

import java.util.Scanner;

public class Arthamatic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();


        System.out.println("Add:"+(a+b));
        System.out.println("Subb:"+(a-b));
        System.out.println("Multi:"+(a*b));
        System.out.println("Remind:"+(b%a));
        System.out.println("Divis:"+(a/b));



    }
}
