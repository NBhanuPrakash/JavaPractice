package july2022;

import java.util.Scanner;

public class BtwAddNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two between numberrs or add:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        while (n1<=n2){
            if (n1%2!=0){
                System.out.print(n1+" ");
            }
            n1++;
        }
    }
}
