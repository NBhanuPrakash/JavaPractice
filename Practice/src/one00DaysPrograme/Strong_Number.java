package one00DaysPrograme;

import java.util.Scanner;

public class Strong_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int fact=1;
        int sum=0;
        int sim=num;
        if (num==0){
            sum=sum+fact;
        }
        else {
            while (sim != 0) {
                fact = 1;
                int first = sim % 10;
                for (int i = 1; i <= first; i++)
                    fact = fact * i;
                    sum = sum + fact;
                    sim = sim / 10;

            }
        }
        if (sum == num) {
            System.out.println("It's Strong number:" + sum);
        } else {
            System.out.println("It's Not a Strong Number:" + sum);
        }
    }
}
