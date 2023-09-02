package August2022;

import java.util.Vector;

public class Vectorclass {
    public static void main(String[] args){
        Vector v = new Vector(4);
        v.add("Prakash");
        String s = "Bhanu";
        v.add(s);
        int a = 9035;
        Integer i = new Integer(a);
        v.add(i);
        System.out.println("Vector elements:");
        System.out.println(" "+v);
        Float f = new Float(46.22);
        v.add(f);
        System.out.println("Vector elements:");
        System.out.println(" "+v);
        v.remove(0);
        System.out.println("vector elements:");
        System.out.println(v);
        Double d = new Double(895.256);
        v.add(d);
        System.out.println("Vector elements:");
        System.out.println(" "+v);




    }
}
