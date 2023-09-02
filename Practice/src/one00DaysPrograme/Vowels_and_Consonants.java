package one00DaysPrograme;


import java.util.Scanner;

public class Vowels_and_Consonants {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
       char ch= sc.next().charAt(0);

       if (ch>=65 && ch<=90){
           ch=((char) (ch+32));
       }

        if (ch=='a' || ch=='e'|| ch =='i'||ch=='o'||ch=='u'){
            System.out.println("its vowels");

        }
        else if (ch>='a' && ch<='z'){
            System.out.println("its consonents");
        }
        else {
            System.out.println("its invalid");
        }

    }

}
