package july2022;

import java.util.Scanner;

public class GreaterThanOrLessThan {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (n1>=n2)
        {
            System.out.println("It's greater number:"+n1);
        }
        else
        {
            System.out.println("It's n1 is Lessthan number : "+n2);
        }
    }

}
