package one00DaysPrograme;

import java.util.Scanner;

public class Finding_Alphabets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char str = sc.next().charAt(0);
        if (str>=97 && str<=122){
            str = ((char) (str-32));
        }
        if (str>=65 && str<=90){
            System.out.println("Its a Alphabets:"+str);
        }
        else {
            System.out.println("it's not Alphabets:"+str);
        }

    }
}
