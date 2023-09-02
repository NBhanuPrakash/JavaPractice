package july2022;

import java.util.Scanner;

public class EvenNumberOrOddNumber {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        long n = scan.nextInt();
        if (n%2==0)
        {
            System.out.println("Even number:" +n);
        }
        else{
            System.out.println("Oddnumber:" +n);
        }
    }
}
