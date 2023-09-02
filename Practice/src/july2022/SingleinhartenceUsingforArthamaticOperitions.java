package july2022;

 class baseclass {
     int n1;
     baseclass(int n1)
     {
         System.out.println("We are Going to N Natural numbers.");
     }
}
class Parentclass extends baseclass{
     int i;
     Parentclass(int n1){
         super(n1);
         for (i=1;i<=n1; i++)
         {
             System.out.print(" "+i);
         }
     }
     void print()
     {
         System.out.println(".");
     }

}
public class SingleinhartenceUsingforArthamaticOperitions {
     public static void main(String[] args){
         Parentclass sc = new Parentclass(100);
         sc.print();
     }
}
