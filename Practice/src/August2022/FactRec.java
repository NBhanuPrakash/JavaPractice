package August2022;

import java.util.Scanner;

public class FactRec {
    public static int reverseword(int num1){
        int fact;
        fact =1;
        for (int i=1; i<=num1; i++)
        {
            fact=fact*i;
            System.out.println(i);

        }
        return fact;


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enterthenumber:");
        int a = sc.nextInt();

        System.out.println(+a+"!="+reverseword(a));
    }
}
