package july2022;

 class Statics {
     static int count = 10;
     static void Static_fun(int a)
     {
         a = 50;
         a++;
         count++;
         System.out.println("Enter the values:"+a);
         System.out.println("Enter the values:"+count);

     }
     static void print(){
         System.out.println("print()");
     }

     public static void Static_fun() {
     }
 }
public class StaticMethods {
     public static void main(String[] args){
         Statics.Static_fun();
         Statics.Static_fun();
         Statics.Static_fun();
         Statics.print();
         int t = Math.abs(-566);
         System.out.println("Numbers:"+t);
         System.out.println("Numbers:"+Math.pow(5,2));


     }
}
