package july2022;

//n import javax.swing.plaf.synth.SynthOptionPaneUI;

class Addition {
    void add()
    {
        int a=100;
        int b=200;
        System.out.println("ENter the number with no argments and with out return values: ");
        System.out.println("Addition:"+(a+b));

    }
    int add(int a,int b)
    {
        System.out.println("enter the numbers of with argments and with return values: ");
        System.out.println("Addition:"+(a+b));
        return a+b;
    }
    double add(double x,double y,double z)
    {
        System.out.println("Enter the three values eith argments and with return values:");
        System.out.println("Enter the values:"+(x+y+z));
        return x+y+z;
    }
}
public class OverLoading {
    public static void main(String[] args){
        Addition Sc = new Addition();
        Sc.add() ;
        int t = Sc.add(56,85);
        //n System.out.println("Enter the numbers:"+(t));
        t=Sc.add(45,65);
        //n System.out.println("Enter the Secound Additions:"+t);
        double d = Sc.add(56,54,75);
        //n System.out.println("Using double values:"+b);
    }

}
