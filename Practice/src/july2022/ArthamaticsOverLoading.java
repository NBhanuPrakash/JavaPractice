package july2022;

class Arthamatics {
    int Arth(int a, int b)
    {
        System.out.println("Addition:"+(a+b));
        System.out.println("Substractions:"+(a-b));
        System.out.println("Multiplication:"+(a*b));
        System.out.println("Division:"+(a/b));
        System.out.println("Divisbility:"+(a%b));
        return a+b;
    }


    public void Arth() {
    }
}
public class ArthamaticsOverLoading {
    public static void main(String []args){
        Arthamatics sc = new Arthamatics();
        sc.Arth();
        int t = sc.Arth(50,65);
    }
}
