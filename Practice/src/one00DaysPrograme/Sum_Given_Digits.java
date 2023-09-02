package one00DaysPrograme;

import java.util.Scanner;

public class Sum_Given_Digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sum of numbers:");
        int num = sc.nextInt();
        int add=0;
        while (num!=0){
            add=add+num%10;
            num=num/10;
        }
        System.out.println(+add);
    }
}
