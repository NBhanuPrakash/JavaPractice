package September2022;

import java.util.Scanner;

public class LargeestnumberInGiven {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the numbers ");
        int x= sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int largest=0;
        if (x>y && x>z){
            largest=x;
        }
        else if(y>x && y>z){
            largest=y;
        }
        else if (z>x && z>y){
            largest=z;
        }
        System.out.println("largest number = "+largest);
    }
}
