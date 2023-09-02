package one00DaysPrograme;

import java.util.Scanner;

public class String_Sequance_of_Words {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Words:");
        String str1 = sc.nextLine();
        int []sequances = new int[str1.length()];
        int i,j;
        char []str2 = str1.toCharArray();
        for ( i=0; i<str1.length(); i++){
            sequances[i]=1;
            for ( j=i+1; j<str1.length(); j++){
                if (str2[i]==str2[j]){
                    sequances[i]++;
                    str2[j]='0';
                }
            }
        }
        System.out.println("Sequance of Words:");
        for( i = 0; i < sequances.length; i++) {
            if(str2[i] != ' ' && str2[i] != '0')
                System.out.println(str2[i] + "-" + sequances[i]);


        }
    }
}
