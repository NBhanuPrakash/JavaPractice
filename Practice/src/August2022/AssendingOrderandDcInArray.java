package August2022;

import java.util.Scanner;

public class AssendingOrderandDcInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int x = sc.nextInt();
        int []a = new int[x];
        int temp;
        for (int i=0; i<x; i++)
            a[i]=sc.nextInt();
        for (int i=0; i<x; i++)
        {
            for (int j=0; j<x; j++)
            {
                if (a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
        }
        System.out.println("Enter the orders:");
        for (int i:a){
            System.out.println(i);
        }
    }
}
