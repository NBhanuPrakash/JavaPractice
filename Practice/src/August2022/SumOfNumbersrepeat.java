package August2022;


import java.util.Scanner;

 class sumOfNumbersrepeat {


         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         int sum=0;
         int temp=0;
         int sum1=0;
         void print() {
             while (num > 0) {
                 temp = num % 10;
                 sum = sum + temp;
                 num=num/10;
             }
         }
         void result(){
             while (sum>0)
             {
                 int ex=sum%10;
                  sum1=sum1+ex;
                  sum=sum/10;

             }
         }

 }
 public class SumOfNumbersrepeat{
     public static void main(String[] args){
         sumOfNumbersrepeat sc = new sumOfNumbersrepeat();
         sc.result();
     }
 }

