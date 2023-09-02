package july2022;

import java.util.Scanner;

public class SquaresOfNaturalnumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int n = sc.nextInt();
        int sum =0;
        int i;
        for ( i=1; i<=n; i++)
        {
             sum+=i*i;
        }
        System.out.println(n+":Numbers:");
        System.out.println("Natural Numbers:"+sum);
    }
}
