package August2022;


import java.util.Scanner;

public class NumbersToWords {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int n = sc.nextInt();
        int l=n%10; //last digt
        int m=n/10;
        int mm=m%10;//middle
        int f=n/100;//first digit
        int first=n/1000;
        String[] ot={" ","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eihgteen","nineteen"};
        String[] tw={" ","ten","twenty","thirty","forty","fifty","Sixty","seventy","eighty","ninety",};
        String h="hundred";
        String t="Thousand";

            if (n <= 20) {
                System.out.println(ot[n]);
            } else if (n < 100) {
                System.out.println(tw[mm] + ot[l]);
            } else if (n < 1999) {
                System.out.println(ot[f] + h + " " + tw[mm] + " " + ot[l]);
            } else if (n < 9999) {
                System.out.println(ot[first] + t + " " + ot[f] + h + " " + tw[mm] + " " + ot[l]);
            }



    }
}
