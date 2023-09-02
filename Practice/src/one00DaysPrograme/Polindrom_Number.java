package one00DaysPrograme;

import java.util.Scanner;

public class Polindrom_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        int num = sc.nextInt();
        int rem;
        int rev=0;
        int temp = num;
        while (num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if (rev==temp){
            System.out.println("It's a Palindrom Number:"+rev);
        }
        else {
            System.out.println("It's Not a Palindrome Number:"+rev);
        }
    }
}
