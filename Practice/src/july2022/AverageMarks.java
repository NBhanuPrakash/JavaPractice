package july2022;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name");
        String name = sc.next();
        System.out.println("Enter the Number:");
        long number = sc.nextLong();
        System.out.println("Enter the marks:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        char grade = 0;
        int total=0;
        double per=0;
        if (m1>=45 && m2>=45 && m3>=45)
        {
            total =(m1+m2+m3);

            per =((double)total/300)*100;
            if(per>=90 && per<=100)
               grade='s';
            else if (per>=80 && per<=89)
                grade='A';
            else if (per>=70 && per<=79)
                grade='B';
            else if (per>=60 && per<=69)
                grade='C';
            else if (per>=50 && per<=59)
                grade='D';
            else if (per>=46 && per<=49)
                grade='E';
        }
        else
            grade='F';
        System.out.println("Student details:");
        System.out.println("Student Name:"+name);
        System.out.println("Student Roll Number:"+number);
        System.out.println("Student Total Marks:"+total);
        System.out.println("Student grade:"+grade);
        System.out.println("Student percentage:"+per);






    }
}
