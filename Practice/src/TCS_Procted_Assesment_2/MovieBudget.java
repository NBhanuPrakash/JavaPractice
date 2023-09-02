package TCS_Procted_Assesment_2;

import java.util.Arrays;
import java.util.Scanner;

public class MovieBudget {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
movie [] arr = new movie[4];
        for (int i = 0; i < 4; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            arr[i] = new movie(a,b,c,d);
        }
        String genre = sc.nextLine();
        movie[] res = searchMoviegenre(arr,genre);
        for (int i = 0; i < res.length; i++) {
            if (res[i].getBudget()>80000000){
                System.out.println("Its a High Budget Movie");
            }
            else {
                System.out.println("Its Low Budget Movie");
            }
        }
    }
    static  movie[] searchMoviegenre(movie[] arr, String genre){
        movie[] refined = new movie[0];
         for (movie m : arr){
            if(m.getGenre().equalsIgnoreCase(genre)){
                refined = Arrays.copyOf(refined,refined.length+1);
                refined[refined.length-1]=m;
            }
        }
        return refined;
    }
}
class  movie{

    private String moviename;
    private String companyname;
    private String genre;
    private int budget;

    public movie(String moviename, String companyname, String genre, int budget) {
        this.moviename = moviename;
        this.companyname = companyname;
        this.genre = genre;
        this.budget = budget;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
