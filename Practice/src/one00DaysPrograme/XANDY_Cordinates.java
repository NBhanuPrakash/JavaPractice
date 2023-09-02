package one00DaysPrograme;

import java.util.Scanner;

public class XANDY_Cordinates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X Co-ordinates:");
        int X = sc.nextInt();
        System.out.println("Enter the Y Co-ordinates:");
        int Y = sc.nextInt();
        if (X>0 && Y>0){
            System.out.println("it's first co-ordinates");
        }
        else if(X<0 && Y>0){
            System.out.println("It's secound co-ordinates");
        }
        else if (X<0 && Y<0){
            System.out.println("It's Third Co-ordinates");
        }
        else if (X>0 && Y<0) {
            System.out.println("It's Fourth Co-ordinates");
        }
    }
}
