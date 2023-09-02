package one00DaysPrograme;

import java.util.Scanner;

public class Perfect_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Perfect Number...");
        int num = sc.nextInt();
        int sum=0;
        for (int i=1; i<num; i++){
            if (num%i==0){
                sum=sum+i;
            }
        }
        if (sum==num){
            System.out.println("It's perfect number:"+sum);
        }
        else {
            System.out.println("It's Not a perfect Number:"+sum);
        }
    }
}
