package one00DaysPrograme;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        int num= sc.nextInt();
        int rev=0;
        int rem;
        while (num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println("reverase number:"+rev);

    }
}
