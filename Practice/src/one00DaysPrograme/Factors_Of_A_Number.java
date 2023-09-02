package one00DaysPrograme;

import java.util.Scanner;

public class Factors_Of_A_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int fact = 1;
        for (int i=1; i<=num; i++){
            if (num%i==0)
                fact=fact*i;
            System.out.print(i+",");

        }
    }
}
