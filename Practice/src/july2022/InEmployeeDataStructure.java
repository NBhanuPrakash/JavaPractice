package july2022;

class employee{

        int Sno1;
        int Sno2;
        int Sno3;
        void name()   //n @overriding concept
        {
            Sno1 = 9035;
            Sno2 = 9024;
            Sno3 = 9016;
        }
}
class names extends employee{
    String name1;
    String name2;
    String name3;
    int m1,m2,m3;
    int ma1,ma2,ma3;
    int mar1,mar2,mar3;

    double total1=0;
    double per1 =0;
    double total2=0;
    double per2 =0;
    double total3=0;
    double per3 =0;
    void name(){   //n @overriding concept
        super.name();
        total1 = m1 + m2 + m3;
        per1 = ( total1 / 300) * 100;
        total2 = ma1+ma2+ma3;
        per2 = (total2/300)*100;
        total3 = mar1+mar2+mar3;
        per3 = (total3/300)*100;


        System.out.println("Name:"+name1);
        System.out.println("ID number:" + Sno1);
        System.out.println("Total marks:"+total1);
        System.out.println("percentage:"+per1);

        System.out.println("Name:"+name2);
        System.out.println("ID number:" + Sno2);
        System.out.println("Total marks:"+total2);
        System.out.println("percentages:"+per2);

        System.out.println("Name:"+name3);
        System.out.println("ID number:" + Sno3);
        System.out.println("Total marks:"+total3);
        System.out.println("percentages:"+per3);


    }
}
class marks extends names
{
    String grade;
    void name(){  //n @overriding concept
        super.name();
        int M1=m1=ma1=mar1;
        int M2=m2=ma2=mar2;
        int M3=m3=ma3=mar3;
        double P=per1;
        double P1=per2;
        double P2=per3;


        if (M1>=45 && M2>=45 && M3>=45)
        {


            if((P>=90 && P<=100) && (P1>=90 && P1<=100) && (P2>=90 && P2<=100)){
                grade="S grade";
            System.out.println(""+grade);
            }
            else if ((P>=80 && P<=89) && (P1>=80 && P1<=89) && (P2>=80 && P2<=89))
            {
                grade = "A grade";
                System.out.println(""+grade);
            }

            else if ((P>=70 && P<=79) && (P1>=70 && P1<=79) && (P2>=70 && P2<=79)) {
                grade = "B grade";
                System.out.println("" + grade);
            }
            else if ((P>=60 && P<=69) && (P1>=60 && P1<=69) && (P2>=60 && P2<=69)) {
                grade = "C grade";
                System.out.println("" + grade);
            }
            else if ((P>=50 && P<=59) && (P1>=50 && P1<=59) && (P2>=50 && P2<=59)) {
                grade = "D grade";
                System.out.println("" + grade);
            }
            else if ((P>=46 && P<=49) && (P1>=46 && P1<=49) && (P2>=46 && P2<=49)) {
                grade = "E grade";
                System.out.println("" + grade);
            }
        }
        else
            grade="F grade";
        System.out.println(""+grade);



    }

}

public class InEmployeeDataStructure {
    public static void main(String[] args)
    {
        marks sc = new marks();
        sc.name1="Bhanu";
        sc.name2="Dheeru";
        sc.name3="Mahi";
        sc.m1=99;
        sc.m2=52;
        sc.m3=69;
        sc.ma1=50;
        sc.ma2=60;
        sc.ma3=75;
        sc.mar1=99;
        sc.mar2=89;
        sc.mar3=92;
        sc.name();



    }
}