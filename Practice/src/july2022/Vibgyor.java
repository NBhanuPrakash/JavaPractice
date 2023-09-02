package july2022;

import java.util.Locale;
import java.util.Scanner;

public class Vibgyor {
    public static void main(String[] args){
        long startingTime = System.currentTimeMillis();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numbers:");
        char ch = sc.next().charAt(0);
        if (ch>=97 && ch<=122)
        {
            ch=(char) (int) (ch-32);
        }
        else if (ch>=48 && ch<=57)
        {
            System.out.println("Natural Numbers:"+ch);
        }


        switch (ch)
        {
            case 'V':
                System.out.println("Violet");
                break;
            case 'I':
                System.out.println("Indigo");
                break;
            case 'B':
                System.out.println("Blue");
                break;

            case 'G':
                System.out.println("Green");
                break;

            case 'Y':
                System.out.println("Yellow");
                break;

            case 'O':
                System.out.println("Orange");
                break;

            case 'R':
                System.out.println("Red");
                break;
            default:
                System.out.println("Its not a vibgyor:");

        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total Excution Time:"+(endTime-startingTime));

    }
}
