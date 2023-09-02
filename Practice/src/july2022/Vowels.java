package july2022;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the Word:");
        char ch = sc.next().charAt(0);
        if (ch>=65 && ch<=90)
        {
            ch= (char) (ch+32);
        }
        switch (ch) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("vowels");
                break;

            default:

                System.out.println("Consonents");
                break;



        }

    }
}
