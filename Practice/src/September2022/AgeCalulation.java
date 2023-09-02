package September2022;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year:");
        int birthyear = sc.nextInt();
        System.out.print("Enter the month 01-12:");
        int birthmonth = sc.nextInt();
        System.out.print("Enter the date :");
        int birthdate = sc.nextInt();



        LocalDate now = LocalDate.now();
        LocalDate current = LocalDate.of(birthyear,birthmonth,birthdate);
        Period period = Period.between(current,now);
        if (period.isNegative()){
            System.out.println("This person is not born yet !!!.");
        }
        else {


            System.out.println("yours age:" + period.getYears() + " Number of Months:" + period.getMonths() + " Number of Days :" + period.getDays());
        }

    }
}
