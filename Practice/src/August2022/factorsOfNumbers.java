package August2022;

import java.util.Scanner;

class factors {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    void results()
    {
        for (int i=1; i<=num; i++)
        {
         if (num%i==0)
             System.out.println("Factors"+i);
        }
    }
}
public class factorsOfNumbers {
    public static void main(String[] args) {
        factors sc = new factors();
        sc.results();
    }


}
