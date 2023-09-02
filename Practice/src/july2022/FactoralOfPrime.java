package july2022;

import java.util.Scanner;

public class FactoralOfPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Factorial Number:");
        int i = 1;
        int n2 = sc.nextInt();
        int count = 0;
        while (i<=n2){
            if(n2%i==0){
                System.out.print(i+" ");
                count++;
            }
            i++;


        }
        if (count==2){
            System.out.println("its a prime number:"+n2);
        }
        else {
            System.out.println("its not a prime number:"+n2);
        }

    }
}
