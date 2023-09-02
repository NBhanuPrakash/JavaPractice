package one00DaysPrograme;

import java.util.Scanner;

public class Two_Handshakes_max {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int total = num*(num-1)/2;
        System.out.println("Total num of hand shakes:"+total);
    }
}
