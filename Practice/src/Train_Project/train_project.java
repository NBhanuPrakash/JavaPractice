package Train_Project;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class train_project {
    static Map<Integer, Train> userMap = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    static boolean exitFlag = true;

    public static void main(String[] args) {
        while (exitFlag) {
            print();
            print("Enter the 1 create the coach......");
            print("Enter the 2 Check Availability.......");
            print("Enter the 3 Book the Ticket......");
            print("Enter the 4 Cancel Ticket......");
            print("Enter the 5 Print Chart......");

            int UserChoice = sc.nextInt();
            switch (UserChoice){
                case 1:{
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    int num3 = sc.nextInt();
                    break;

                }
                case 2:{
                    int num = 1;
                    int num2 =49;
                    int sum = num+num2;
                    System.out.println(sum);
                    break;
                }
                case 3:{
                    CreateUser();
                    break;

                }
                case 4:{
                    CancelUser();
                    break;
                }
            }

        }


    }
    public static void CancelUser(){

        int CancelTicket = captureCancelTicket();
        String Ticketcancel = captureTicket();

    }
    public static int captureCancelTicket(){
        System.out.println("Enter Your Pnr Number:");
        int pnr = sc.nextInt();
        Train userobj = userMap.get(pnr);
        if (userobj==null){
            System.out.println("It's Invalid Pnr Number");

        }
        return pnr;
    }
    public static String captureTicket(){
        print("Enter the Option 1 Cancel Ticket.....");
        print("Enter the Option 2 PNR Status.....");
        print("Enter the Option 3 Refundbul Details.....");

        int choice = sc.nextInt();
        switch (choice){
            case 1: {
                System.out.println("Enter the PNR Number");
                int number = sc.nextInt();
                Train userobj = userMap.get(number);
                if (userobj == null) {
                    System.out.println("Its Invalid Pnr Number....");
                    break;
                }
                System.out.println("Successfully Cancelled Your Ticket... Other Details Sent to your Mobile Number...");
            }
            case 2:{
                System.out.println("Enter the PNR Number");
                int number = sc.nextInt();
                Train userobj = userMap.get(number);
                if (userobj == null) {
                    System.out.println("Its Invalid Pnr Number....");
                    break;
                }



            }

        }

        return null;
    }

    public static void CreateUser(){
        String name = capturename();
        int age = captureage();
        String Number = captureNumber();
        String gender = capturegender();
        String berth = captureberth();
        int pnr = capturepnr();
        Train userobj = new Train(name,age,Number,gender,berth,pnr);
        userMap.put(pnr,userobj);



    }
    private static String capturename(){
        System.out.println("Enter the Name:");
        String name = sc.next();
        return name;

    }
    private static int captureage(){
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        return age;
    }
    private static String captureNumber(){
        System.out.println("Enter Your Phone Number:");
        String number;
        for (number=sc.next(); number.length()!=10; number= sc.next()){
            System.out.println("It's Invalid mobile Number");
        }
        return number;

    }
    private static String capturegender(){
        System.out.println("Enter your Gender");
        String gender = sc.next();
        while (true){
            if (gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")) {
                break;
            }
        }
        return gender;
    }
    public static String captureberth(){
        System.out.println("Enter the Bearth: Lower or Upper or Middle or SideLower or SideUpper or ");
        String berth = sc.next();
        while (true){
            if (berth.equalsIgnoreCase("Lower") || berth.equalsIgnoreCase("Upper") || berth.equalsIgnoreCase("Middle") || berth.equalsIgnoreCase("SideLower") || berth.equalsIgnoreCase("SideUpper")){
                break;
            }
        }
        return berth;
    }
    public static int capturepnr(){
        int pnr;
        pnr = new Random().nextInt(100000)+1000000;
        System.out.println("Sucessfully done your Ticket Reservation..." +"Seat Numbers and Other Information Will Sent To Your Registered Mobile Number..."+"And Your PNR Number:"+pnr);
        return pnr;
    }


    public static void print() {
        System.out.println();
    }

    public static void print(String msg) {
        System.out.println(msg);
    }
}


class Train{
    private String name;
    private int age;
    private String number;
    private String gender;
    private String berth;
    private int pnr;

    public Train(String name, int age, String s, String gender, String number, int pnr) {
        this.number = number;
    }

    public Train(String name, int age, String gender, String berth, int pnr) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.berth = berth;
        this.pnr = pnr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBerth() {
        return berth;
    }

    public void setBerth(String berth) {
        this.berth = berth;
    }

    public int getPnr() {
        return pnr;
    }

    public void setPnr(int pnr) {
        this.pnr = pnr;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


}
