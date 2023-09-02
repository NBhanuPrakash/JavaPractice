package September2022;

public class Alphabets {
    public static void main(String[] args){
        char ch;
        System.out.println("===============***===================");
        for (int i=65; i<=90; i++){
            ch=(char) i;
            System.out.print("  "+ch);
        }
        System.out.println();
        for (int i=97; i<=122; i++){
            ch=(char) i;
            System.out.print("  "+ch);
        }
        System.out.println();
        for (int i=1; i<=26; i++){
            System.out.print("  "+i);
        }
        System.out.println();
        System.out.println("===============***===================");
    }
}
