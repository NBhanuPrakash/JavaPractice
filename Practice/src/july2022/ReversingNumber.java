package july2022;

import java.awt.desktop.PreferencesEvent;
import java.util.Scanner;

public class ReversingNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scan.nextInt();
        int rev = 0;
        int rem = 0;
        while (num>0)
        {
           rem = num%10;
           rev = rev*10+rem;
           num = num/10;
        }
        System.out.println("Reverse number:"+ rev);
    }
}
