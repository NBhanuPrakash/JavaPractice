package one00DaysPrograme;

import java.util.Scanner;

public class Array_Sum_Of_Elements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int arr = sc.nextInt();
        int []arr2 = new int[arr];
        System.out.println("Enter the Numbers:");
        for (int i=0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        int sum=0;
        for (int j : arr2) {
            sum = sum + j;
        }
        System.out.println("Sum Of Array Elements:"+sum);
    }
}
