package july2022;

public class star_right {
    public static void main(String[] args)
    {
        int n=5;
        System.out.println("Enter the number");
        for(int i=1; i<=n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }


            System.out.println("\n");
        }   //ending line after each row
    }
}

