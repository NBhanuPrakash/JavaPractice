package july2022;

import java.util.Scanner;

public class ReverseMultiplication {
    public static void main(String[] args) {
        long starting = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Tables Numbers:");
        int n = sc.nextInt();
        for (int i = 10; i >= 1; i--) {
            System.out.println(+n + " X " + i + " = " + (n * i));
        }
        long ending = System.currentTimeMillis();
        System.out.println("Total time excution:"+(ending-starting));
    }
}
