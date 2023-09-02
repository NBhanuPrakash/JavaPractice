package one00DaysPrograme;

import java.util.Scanner;

public class Fibinoseries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the Numbers:");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.print(+a+","+b);
        while (b<num){
            c=a+b;
            a=b;
            b=c;
            if (b<=num) {
                System.out.print(","+b);
            }
        }
    }
}
