package one00DaysPrograme;

import java.util.Scanner;

public class Number_of_Even_and_Add_Elements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int arr = sc.nextInt();
        int []arr2 = new int[arr];
        System.out.println("Enter the Number:");
        for (int i=0; i<arr2.length; i++){
            arr2[i]=sc.nextInt();
        }
        int Add=0, Even=0;
        for (int j : arr2) {
            if (j % 2 == 1) {
                Add++;
            } else {
                Even++;
            }
        }
        System.out.println(Add);
        System.out.println(Even);
    }
}
