package September2022;

import java.util.Date;

public class DateAndTime {
    public static void main(String[] args){
        Date d = new Date();
        System.out.println(d);
        for (String s : args){
            System.out.println(s);
        }
    }
}
