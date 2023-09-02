package August2022;

import java.util.Scanner;

public class duplicateNUmbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int x = sc.nextInt();
        System.out.println("Enter the numbers:");
        int[] a = new int[x];
        for (int i = 0; i < x; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.print(+a[j]+" ");
                }
            }

        }
    }
}
