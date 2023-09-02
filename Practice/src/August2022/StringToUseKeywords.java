package August2022;

import java.util.SplittableRandom;

public class StringToUseKeywords {
    public static void main(String[] args) {
        String sc = new String("Bhanu");
        System.out.println("Strings:"+sc);
        String s = sc.toUpperCase();
        System.out.println("Upper case:"+s);
        System.out.println("Lower case: "+sc.toLowerCase());
        String t=sc.replaceAll("Bhanu","phani");
        System.out.println(" Replace:"+t);
        String a = "Bhanu Is a";
        String c=a.concat(" Good Person");
        System.out.println("Concatination:"+c);
        String x="Bhanu";
        String y="Bhanu";
        String z="nnbhanu";
        System.out.println("compare:"+x.compareTo(y));
        System.out.println("Compare to z:"+y.compareTo(z));

    }
}
