package one00DaysPrograme;

import java.util.Scanner;

public class Non_Reapting_Words_Erase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Words:");
        String str1 = sc.nextLine();
        int[] sequance = new int[500];
        for (int i = 0; i < str1.length(); i++) {
            sequance[str1.charAt(i)]++;
        }
        System.out.println("Non Reapting Words:");

        for (int i = 0; i < 500; i++) {
            if (sequance[i] == 1) {
                System.out.print((char) i + "");
            }
        }
    }

}
