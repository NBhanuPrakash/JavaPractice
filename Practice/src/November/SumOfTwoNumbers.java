package November;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

            a=a+b;
            b=a-b;
            a=b-a;
            System.out.println("before"+a+"after"+b);


    }
}
