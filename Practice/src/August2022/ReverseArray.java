package August2022;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] rags)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arr size:");
        int a = sc.nextInt();
        int rem=0;
        int rev = 0;
        int []arr=new int[a];
        for (int i=0;i<a; i++)
            arr[i]=sc.nextInt();
        int num1 = arr.length;
        while (num1>0)
        {
            rem=num1%10;
            rev=rev*10+rem;
            num1=num1/10;
        }
        System.out.println(arr[num1]);

    }
}
