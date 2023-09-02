package August2022;



import java.util.Scanner;

public class NoofVowelsAndConsonts {
    public static int vowels(String str)
    {

        int counts=0;
        int vowels=0;
        str=str.toUpperCase();
        for (int i=0; i<str.length(); i++)
        {
            if (str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
            {
                vowels++;
            }
            else if (str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                counts++;
            }

        }
        System.out.println("Vowels:"+vowels);
        System.out.println("Consonents:"+counts);
        return 0;


    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Words:");
        String str1= sc.nextLine();
        System.out.println(vowels(str1));

    }
}
