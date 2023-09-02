package july2022;

import java.util.Scanner;

public class ReversWord {
    public static void main(String[] args){

        System.out.println("Enter the Word:");
        int i;
        int j;
        String str = "my name is bhanu";
        String str1 = "";
        String a[] = str.split("");
        for ( i=0; i<a.length; i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("\n");
        for ( j=a.length-1; j>=0; j--);
        {
            System.out.println(a[j]+" ");
        }

    }
}
