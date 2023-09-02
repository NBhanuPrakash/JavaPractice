package one00DaysPrograme;

import java.util.Scanner;

public class Sum_Of_N_natural_Numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        int num = sc.nextInt();
        int sum=0;
        for (int i=0; i<=num; i++){
            sum=sum+i;
            System.out.print(","+i);
        }
        System.out.println("="+sum);
    }
}
