package August2022;

import java.util.Scanner;

public class SumofevenoraddinArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        int x =sc.nextInt();
        int []a = new int[x];

        for (int i=0; i<x; i++)
            a[i]=sc.nextInt();
        for (int i:a) {
            if (i%2 == 0) {
                System.out.println(":Even numbers:"+i);
            } else {
                System.out.println(":odd number:"+i);
            }
        }

    }
}
