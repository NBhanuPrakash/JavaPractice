package july2022;

import java.util.Scanner;

public class Between50To100 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if (num>=50 && num<=100){
            System.out.println("It's b/w 50to100:"+num);
        }
        else
        {
            System.out.println("It's not b/w 50to100:"+num);
        }
    }
}
