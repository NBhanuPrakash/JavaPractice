package july2022;

class Bhanu {
    int idno;
    String name;
    double basicsalary;

    Bhanu() {
        System.out.println("Defalut Constructor");
        idno = 9035;
        name = "Bhanu";
        basicsalary = 100000;
    }

    Bhanu(int no, String Name, double Salary) {
        System.out.println("Parameterised Counstructor");
        idno = no;
        name = Name;
        basicsalary = Salary;

    }

    void calc() {
        double hra = basicsalary * 0.12;
        double da = basicsalary * 0.15;
        double ta = basicsalary * 0.12;
        double gsal = basicsalary + hra + da + ta;
        System.out.println("Employess basic salary data:");
        System.out.println("HRA=" + hra + "DA=" + da + "TA=" + ta);
        System.out.println("Employess total grass salary:" + gsal);


    }

    void print() {
        System.out.println("Employee number=" + idno);
        System.out.println("Employee name=" + name);
        calc();
    }


}
public class Prakash{
    public static void main(String[] args){
        Bhanu e = new Bhanu(9035,"Bhanu",5400);
        e.print();
        Bhanu f = new Bhanu();
        f.print();
    }

}
