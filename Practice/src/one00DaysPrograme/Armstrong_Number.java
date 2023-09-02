package one00DaysPrograme;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int a=0;
        int rem;
        int temp = num;
        while (num!=0){
            rem=num%10;
            a=a+rem*rem*rem;
            num=num/10;
        }
        if (temp==a){
            System.out.println("It's a armstrong number:"+a);
        }
        else
        {
            System.out.println("It's not armstrong number"+a);
        }
    }
}
