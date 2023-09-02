package july2022;

class Superclass{
    int a,b;
    Superclass(int a, int b)
    {
        System.out.println("Basic class constructor:");
        this.a=a;
        this.b=b;
    }
}
class Derviation extends Superclass
{
    int c;
    Derviation(int a, int b, int y)
    {
        super(a,b);
        System.out.println("Derive class constructor:");
        c=y;
        System.out.println("Derivation for --> t:"+c);

    }
    void print()
    {
        int x=a%b;
        int z=a+b+c;
        System.out.println("Division:"+x);
        System.out.println("Addition:"+z);
    }
}
public class SingleInhertance {
    public static void main(String[] args){
        Derviation sc = new Derviation(500,600,800);
        sc.print();

    }
}
