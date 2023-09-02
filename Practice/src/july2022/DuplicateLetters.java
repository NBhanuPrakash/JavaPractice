package july2022;


import java.util.Scanner;

public class DuplicateLetters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    String string1;
    int count;
    System.out.println("ENter the Word:");
    string1 = sc.nextLine();


    char[] string = string1.toCharArray();

        System.out.println("Duplicate characters in a given string: ");

        for(int i = 0; i <string.length; i++) {
            count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;

                    string[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if (count > 1 && string[i] != '0')
                System.out.println(string[i]);
        }     }
}


