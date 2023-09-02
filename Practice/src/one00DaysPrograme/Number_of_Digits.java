package one00DaysPrograme;

import java.util.Scanner;

public class Number_of_Digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        int num = sc.nextInt();
        int count=0;
        if (num==0){
            System.out.println("The number of digits is=1");
        }
        else {
            while (num>0){
                count++;
                num=num/10;
            }
            System.out.println("The number of digits:"+count);

        }
    }
}
