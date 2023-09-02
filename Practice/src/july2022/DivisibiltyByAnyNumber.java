package july2022;

import java.util.Optional;
import java.util.Scanner;

public class DivisibiltyByAnyNumber {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1%num2==0)
            {
                System.out.println(" it is divisible "+num1);
            }
        else
        {
            System.out.println("its not divisible "+num1);
        }

    }
}
