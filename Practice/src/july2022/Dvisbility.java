package july2022;

import java.util.Scanner;

public class Dvisbility {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num1 = sc.nextInt();
        if (num1%5==0 )
        {
            System.out.println("It's divisble by 5,7,2:"+num1);
        }
        else
        {
            System.out.println("It's not divisble by 5,7,2:"+num1);
        }
    }
}
