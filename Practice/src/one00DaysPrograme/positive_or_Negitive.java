package one00DaysPrograme;

import java.util.Scanner;

public class positive_or_Negitive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int set = sc .nextInt();
        if (set>0){
            System.out.println("it's a postive number:"+set);
        }
        else if(set==0){
            System.out.println("Either postive or negtive:"+set);

        }
        else{
            System.out.println("its a negtive number:"+set);
        }
    }
}
