package one00DaysPrograme;

import java.util.Scanner;

public class Numbers_of_Largest_And_Smallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the Array size:");
        int arr = sc.nextInt();
        int []arr2 = new int[arr];
        System.out.println("Enter the Values:");
        for (int i=0; i<arr2.length; i++){
            arr2[i]=sc.nextInt();
        }
        int small=arr2[0], Large=arr2[0];
        for (int j : arr2) {
            if (small > j) {
                small = j;
            }
            if (Large < j) {
                Large = j;
            }
        }
        System.out.println("Smaller Value:"+small);
        System.out.println("Larger Value:"+Large);
    }
}
