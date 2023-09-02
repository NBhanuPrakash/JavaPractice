package September2022;

import java.util.Scanner;
class sum{
    void sumu(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        while (num!=0){
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println(sum);

        int e = 0;
         while (sum != 0) {

                e = e + sum % 10;
                sum = sum / 10;


         }
         System.out.println(e);
         int x=0;
         while (e!=0){
             x=x+e%10;
             e=e/10;
         }
        System.out.println(x);
    }

}

public class SumofNumbers {
    public static void main(String[] args){
        sum bc = new sum();
        bc.sumu();

    }
}
