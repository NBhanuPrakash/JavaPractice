package july2022;

import java.util.Scanner;

public class swaping {
    static public void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int a ,b, c;

        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println(+a+" "+b);
        c = a;
        a = b;
        b = c;
        System.out.println(+a+" "+b);
    }

}
