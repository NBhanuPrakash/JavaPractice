package one00DaysPrograme;

import java.util.Scanner;

public class Quadratic_Equation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r1, r2;
        System.out.println("Enter the a b c values ax^2+bx+c=0...");    //ax^2+bx+c=0
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = (b*b)-(4*a*c);
        if (d == 0){
            System.out.println("The roots are real and equal...");
            r1=-b/(2*a);
            r2=-b/(2*a);
            System.out.println("r1= "+r1);
            System.out.println("r2= "+r2);

        }
        else if (d>0){
            System.out.println("The roots are real and distinct...");
            r1=(-b+Math.sqrt(d))/(2*a);
            r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("r1= "+r1);
            System.out.println("r2="+r2);
        }
        else if (d<0){
            System.out.println("Distinct and Imaginary...");
            double x,y;
            x=(-b)/(2*a);
            y=(Math.sqrt(-d))/(2*a);
            System.out.println("R1="+x+"+i"+y);
            System.out.println("R2="+x+"-i"+y);
        }

    }
}
