package july2022;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Addition:"+sum);

    }

}
