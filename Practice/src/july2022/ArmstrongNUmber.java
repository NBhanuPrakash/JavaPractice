package july2022;

import java.util.Scanner;

public class ArmstrongNUmber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scan.nextInt();
        int a = 0;
        int rem;
        int temp = num;
        while (num>0)
        {

            rem = num%10;
            a = a+rem*rem*rem;
            num = num/10;
        }
        if (temp==a) {
            System.out.println("Its a Armstrong Number:" + a);
        }
        else {
            System.out.println("Its not a Amstrong Number:"+a);
        }
    }

}
