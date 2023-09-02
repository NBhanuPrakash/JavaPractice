package one00DaysPrograme;

import java.util.Scanner;

public class Two_Fraction {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the value for x1 and y1: ");
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            System.out.print("Enter the value for x2 and y2: ");
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            int Div;
            int x3=(x1*y2)+(x2*y1);
            int y3=y1*y2;
        Div = Math.min(x3, y3);
            for(int i=Div;i>0;i--)
            {
                if(x3%i==0 && y3%i==0)
                {
                    x3=x3/i;
                    y3=y3/i;
                }
            }
            System.out.print("Sum of fractions is "+x3+"/"+y3);
        }
    }


