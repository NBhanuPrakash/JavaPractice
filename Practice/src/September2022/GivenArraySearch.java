package September2022;

import java.util.Scanner;

public class GivenArraySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size ");
        int size = sc.nextInt();

        int []arr = new int[size];
        System.out.println("enter"+size+"numbers");
        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the search element:");
        int search = sc.nextInt();
        int postion=-1;
        for (int i=0; i<arr.length; i++){
            if (search==arr[i]){
                System.out.println("Found the element:"+i);
            }
            else if (search==postion){
                System.out.println("its not found any element:"+postion);
            }

        }







    }
}
