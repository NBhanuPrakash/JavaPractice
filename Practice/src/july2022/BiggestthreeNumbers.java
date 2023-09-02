package july2022;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class BiggestthreeNumbers {
    public static void main(String[] args){
        Long starting = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b) {
            if (a > c) {
                System.out.println("Biggest a:" + a);
            } else {
                System.out.println("its not Biggest no:" + c);
            }
        }
        else
            {
                if (b>c) {
                    System.out.println("it biggest b:" + b);
                }
                else
                {
                    System.out.println("Its not Biggest no:"+c);
                }
            }

            Long endTime = System.currentTimeMillis();
            System.out.println("Total Excution time:"+(endTime-starting));





    }
}
