package August2022;

import java.util.Scanner;
public class ArraySumOfNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int x=sc.nextInt();
        int []a=new int[x];
        int sum=0;
        for (int i=0; i<x; i++)
            a[i]=sc.nextInt();
        //System.out.println("Size of arrays:"+x);
        for (int i=0; i<x; i++)

        {
            sum+=a[i];
            System.out.print("+"+(a[i]));
        }
        System.out.println("\n");
        System.out.println(sum);
    }
}
