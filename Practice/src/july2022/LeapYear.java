package july2022;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year:");
        int num = scan.nextInt();
        if (num%4==0 && num%400==0 || num%100!=0)
        {
            System.out.println("It is a leap year:"+num);
        }
        else
        {
            System.out.println("It is not leap year:"+num);
        }
    }
}
