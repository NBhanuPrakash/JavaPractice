package july2022;

public class PrintEvenPostion {
    public static void main(String[] args){
        int a[] = new int[] {2,6,5,8,9,10};
        for (int i=2; i<=a.length; i+=2)
        {
            System.out.println("index "+i);
            System.out.println("Value:"+a[i]);
        }
    }
}
