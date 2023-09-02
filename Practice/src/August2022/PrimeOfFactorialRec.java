package August2022;

import java.util.Scanner;

public class PrimeOfFactorialRec {
    public static int Prime()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int num1=sc.nextInt();
        int count=0;
        for (int i=1; i<=num1; i++)
        {
            if (num1%i==0)
            {
                System.out.println(" "+i);
                count++;
            }


        }
        if (count==2)
        {
            System.out.println("Its a prime number:"+num1);
        }
        else {
            System.out.println("Its not prime number:"+num1);
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(Prime());
    }
}
