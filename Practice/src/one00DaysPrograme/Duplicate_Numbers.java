package one00DaysPrograme;

import java.util.Scanner;

public class Duplicate_Numbers {
    static int Dupliacte(int []arr2,int arr){
        if (arr==0 || arr==1)
            return arr;
            int j=0;
            for (int i=0; i<arr-1; i++)
                if (arr2[i]!=arr2[i+1])
                    arr2[j++]=arr2[i];
                    arr2[j++]=arr2[arr-1];


            return j;


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int arr = sc.nextInt();
        int []arr2 = new int[arr];
        System.out.println("ENter the Numbers");
        for (int i=0; i<arr; i++){
            arr2[i] = sc.nextInt();
        }
        int s = Dupliacte(arr2,arr);
        System.out.println("Without Duplicate Numbers:");
        for (int i=0; i<s; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
