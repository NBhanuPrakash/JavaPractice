package August2022;

import java.util.Scanner;

public class DivisbiltyOfArrays {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        int num1 = sc.nextInt();
        int []a =new int[num1];
                for (int i=0; i<num1; i++)
            a[i]=sc.nextInt();
        for (int i:a){
            if (i%3==0){
                System.out.println("Its is Divisble:"+i);

            }
            else
            {
                System.out.println("Its not Divisble:"+i);
            }
        }
    }
}
