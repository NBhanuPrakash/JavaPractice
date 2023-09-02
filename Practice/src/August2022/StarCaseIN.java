package August2022;

import java.util.Scanner;

class Star {
     Scanner sc = new Scanner(System.in);

     void result()
     {
         int num1 = sc.nextInt();
         System.out.println("----------------------------------------");
         for (int i=1; i<=num1; i++)
         {
             for (int j=1; j<=num1; j++) {
                 System.out.print(" *");
             }
             System.out.println();
         }
         System.out.println("----------------------------------------");
     }

}
class Lefttstar extends Star
{
    void result()
    {
        super.result();
        int num1 = sc.nextInt();
        System.out.println("----------------------------------------");
        for (int i=1; i<=num1; i++)
        {
            for (int j=1; j<=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");
    }

}
class Dcresseingstar extends Lefttstar
{
    void result()
    {
        super.result();
        int num1 = sc.nextInt();
        System.out.println("----------------------------------------");
        for (int i=1; i<=num1; i++)
        {
            for (int j=i; j<=num1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");
    }
}
class Rightstar extends Dcresseingstar
{
    void result()
    {
        super.result();
        int num1 = sc.nextInt();
        System.out.println("----------------------------------------");
        for (int i=1; i<=num1; i++)
        {
            for (int j=i; j<=num1; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");
    }
}

public class StarCaseIN {
    public static void main(String[] args){
        System.out.println("Enter the numbers:");
        Rightstar sc = new Rightstar();
        sc.result();
    }
}
