package july2022;

import java.util.Scanner;

public class DivisibiltyByWhileLoop {
    public static void main(String[] args)
    {
        long starter = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        while (n1<=n2){
            if (n1%5==0){
                System.out.print(n1+" ");
            }
            n1++;
        }
        long ender = System.currentTimeMillis();
        System.out.println("/n");
        System.out.println("Excution Time:"+(ender-starter));
    }

}
