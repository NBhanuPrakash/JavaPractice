package TCS_Proctated_Assesment1;

import java.util.Scanner;

public class True_or_false {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
