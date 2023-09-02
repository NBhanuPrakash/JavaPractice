package one00DaysPrograme;

import java.util.Scanner;

public class Month_In_A_Days {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();
        System.out.println("Enter the Month:");
        int month = sc.nextInt();
        if(((month==2)&&(year%400==0)) || ((year%100!=0)&&(year%4==0))) {
            System.out.println("29 days");
        }

        else if (month==2){
            System.out.println("28 Days");

        }

        else if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            System.out.println("31 Days");

        }else{
            System.out.println("30 Days");
        }

    }
}
