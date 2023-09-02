package july2022;

import java.util.Scanner;

public class DuplicateNumber {
    public static void main(String[] args){
        int  []a = {5,6,5,2,4,4,2,8,7,1,1};


        System.out.println("Enter the number:");

        for (int i = 0; i<a.length; i++){
            for (int j =1+i; j<a.length; j++){
                if (a[i] == a[j])
                {
                    System.out.println("Duplicatenumber:"+a[j]);
                }
            }
        }

    }
}
