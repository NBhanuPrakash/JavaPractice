package August2022;

import java.util.Scanner;

public class BubbleSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("Enter the arr size:");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the :" + num + ":numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorting of a numbers:");
        for ( int k=0; k<arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}