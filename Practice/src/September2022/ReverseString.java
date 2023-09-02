package September2022;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String W = sc.nextLine();
        String []word = W.split("\\s");
        for (int i = word.length-1; i>=0; i--){
            System.out.println(word[i]);
        }
    }
}
