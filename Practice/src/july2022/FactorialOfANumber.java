package july2022;

import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String []args)
    {
        long startingtime = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        long f=1;
        int i=1;
        int n1 = sc.nextInt();
        while (i<=n1)
        {
            f=f*i;
            i++;
        }
        System.out.println(+n1+"! Factorial of:"+f);
        long endingtime = System.currentTimeMillis();
        System.out.println(" ");
        System.out.println("Total time excution:"+(endingtime-startingtime));
    }
}
