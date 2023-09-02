package one00DaysPrograme;

import java.util.Scanner;

public class Even_or_Add {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        int num=sc.nextInt();
        if (num%2==0){
            System.out.println("It's a even number:"+num);
        }
        else {
            System.out.println("it's a add number:"+num);
        }
    }
}
