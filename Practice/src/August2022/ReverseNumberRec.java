package August2022;

import java.util.Scanner;

public class ReverseNumberRec {


     public static int number()
     {

         Scanner scan = new Scanner(System.in);
         //System.out.println("Enter the Number");
         int num = scan.nextInt();
         int temp = num;

         int rev = 0;
         int rem;
         while (num>0)
         {
             rem = num%10;
             rev = rev*10+rem;
             num = num/10;
         }
         if (temp == rev) {
             System.out.println("It's polindrome number");
         }
         else
         {
             System.out.println("It's not plodrome number:");
         }
         //System.out.println("Reverse number:"+ rev);
         return rev;

     }
     public static  void main(String[] args)
     {
         System.out.println("Enter the numbers:");
         System.out.println(number());
     }

}
