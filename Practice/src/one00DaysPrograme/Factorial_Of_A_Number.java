package one00DaysPrograme;

import java.util.Scanner;

public class Factorial_Of_A_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int fact = 1;

            for (int i=1; i<=num; i++) {
                fact = fact*i;
            }
            System.out.println("factorial of a number:" + fact);


    }
}
