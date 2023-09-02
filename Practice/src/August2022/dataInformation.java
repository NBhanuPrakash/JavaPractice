package August2022;

import java.util.Scanner;

class Information {
    Information() {
        System.out.println("Enter the Number:");
    }

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int idno = sc.nextInt();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        double total1 = 0;
        double per = 0;
        String grade;



        void print () {
            total1 = m1 + m2 + m3;
            per = (total1 / 300) * 100;
            if (m1 >= 45 && m2 >= 45 && m3 >= 45) {
                if (per >= 90 && per <= 100)
                    grade = "S grade";
                else if (per >= 80 && per <= 89)
                    grade = "A grade";
                else if (per >= 70 && per <= 79)
                    grade = "B grade";

            } else
                grade = "F grade";
            System.out.println("-----------------------**-----------------------");
            System.out.println("name:" + name);
            System.out.println("id number:" + idno);
            System.out.println("Total marks" + total1);
            System.out.println("Percentage:" + per);
            System.out.println("grade:" + grade);


        }

}
class onemoreperson extends Information{
    Scanner sc = new Scanner(System.in);

    String name1 = sc.next();
    int idno1 = sc.nextInt();
    int M1 = sc.nextInt();
    int M2 = sc.nextInt();
    int M3 = sc.nextInt();

    double total2 = 0;
    double per2 = 0;
    String grade2;
    void print(){
        super.print();
        total2=M1+M2+M3;
        per2=(total2/300)*100;
        if (M1>=45 && M2>=45 && M3>=45){
            if (per2>=90 && per2<=100)
                grade2="S grade";
            else if (per2>=80 && per2<=89)
                grade2="A grade";
            else if (per2>=70 && per2<=79)
                grade2="B grade";

        }else
            grade2="F grade";
        System.out.println("---------------------**-------------------------");
        System.out.println("name:"+name1);
        System.out.println("id number:"+idno1);
        System.out.println("Total marks"+total2);
        System.out.println("Percentage"+per2);
        System.out.println("grade:"+grade2);
        System.out.println("----------------------**------------------------");



    }

}
public class dataInformation {
    public static void main(String[] args){
        onemoreperson sc= new onemoreperson();

        sc.print();
    }

}

