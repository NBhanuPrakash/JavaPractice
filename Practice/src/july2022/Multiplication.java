package july2022;

import java.util.Scanner;

public class Multiplication {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Tables Numbers:");
         int n = sc.nextInt();
         for (int i=1; i<=n; i++)
         {
             System.out.println("Tables:"+i);
             for (int j=1; j<=10; j++) {
                 System.out.println(+i+"X" + j + "=" + (i * j));
             }

         }


    }

}
