package August2022;

import java.util.Scanner;

class series {
     Scanner sc = new Scanner(System.in);
     int num =sc.nextInt();
     int b =1;
     int a =0;
     int c;
     void result()
     {
         if (num>0)
         {
             System.out.println("Fibonoseries" +a+ "," +b+ ",");
             while (b<=num)
             {
                 c=a+b;
                 a=b;
                 b=c;
                 if (b<=num)
                     System.out.print(b+"");
             }
         }
         else
             System.out.println("Invalid Number");
     }

}
public class FabinossSeriessIn {
    public static void main(String[] args){
        series sc = new series();
        System.out.println("Enter the number:");
        sc.result();
    }
}
