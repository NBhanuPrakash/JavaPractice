package November;

import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("enter the size elemnets:");
        int []arr = new int[size];
        for (int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("EEnter the Search value:");
        int search= sc.nextInt();
        int mid;
        int first=0;
        int last=arr.length-1;
        int found=0;
        while (first<=last){
            mid=(first+last)/2;
            if (arr[mid]==search){
                System.out.println("Found the element:" + mid);
                found = 1;
                break;
            }
            else if (arr[mid]>search){
                last=mid-1;
            }
            else{
                first=mid+1;
            }
        }
        if ((found==0) || (first>=last)){
            System.out.println("The element is not found:");
        }




    }
}
