package july2022;

import java.util.Scanner;

public class ThreeEqualNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a==b && a==c && b==c)
        {
            System.out.println("It's equal to a=b=c");
        }
        else
        {
            System.out.println("it's not equal to a=b=c");
        }
    }

}
