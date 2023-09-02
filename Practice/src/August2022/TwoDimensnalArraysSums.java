package August2022;

import java.util.Scanner;

public class TwoDimensnalArraysSums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int r = sc.nextInt();
        int s = sc.nextInt();
        int [] []a = new int[r][s];
        for (int i=0; i<r; i++){
            for (int j=0; j<s; j++){
                a[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        System.out.println(" "+r+" "+s+" ");
        for (int i=0; i<r; i++){
            for (int j=0; j<s; j++){
                sum+=a[i][j];
                System.out.print("+"+(a[i][j]));
            }
        }
        sc.nextLine();
        System.out.println("="+sum);
          
    }
}
