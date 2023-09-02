package August2022;

import java.util.Scanner;

public class LinearSearchArr {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("array number:"+n+":enter the numbers:");
        for (int i=0; i<arr.length; i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter the searching number:");
        int searchele=sc.nextInt();
        int position=-1;
        for (int i=0; i<arr.length; i++)
        {
            if (arr[i]==searchele)
            {
                position=i;
                break;
            }

        }
        if (position!=-1)
        {
            System.out.println("It's found the position:"+position);
        }
        else
        {
            System.out.println("It's not found the position:"+position);
        }

    }
}
