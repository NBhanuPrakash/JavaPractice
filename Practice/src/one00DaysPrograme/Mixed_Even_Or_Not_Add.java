package one00DaysPrograme;

import java.util.Arrays;
import java.util.Scanner;

public class Mixed_Even_Or_Not_Add {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size:");
        int arr = sc.nextInt();
        int []arr2 = new int[arr];
        System.out.println("Enter the Numbers:");
        for (int i=0; i<arr; i++){
            arr2[i]=sc.nextInt();
        }
        int add=0,even=0;
        for (int j=0; j<arr; j++) {
            if ((arr2[j] % 2) == 1)
                add++;

            else
                even++;

        }
        if (add==arr){
            System.out.println("Its add number:"+ Arrays.toString(arr2));
        }
        else if (even==arr){
            System.out.println("It's a EVen Number:"+ Arrays.toString(arr2));
        }
        else{
            System.out.println("its a Mixed Fraction:"+ Arrays.toString(arr2));
        }

    }
}
