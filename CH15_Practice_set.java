package Advanced_java;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Stack;

public class CH15_Practice_set {
    public static void main(String[] args) {
        //Que 1
        ArrayList<String> xsr = new ArrayList<>();
        xsr.add("Raj");
        xsr.add("Ram");
        xsr.add("Raghu");
        xsr.add("Rameshwar");
        xsr.add("Ramit");
        xsr.add("Raman");
        xsr.add("Rajan");
        xsr.add("Raag");
        xsr.add("Ramesh");
        xsr.add("Raghuveer");
        for(String cr:xsr){
//            System.out.println(cr);
        }

        //Que 2
        LocalTime rs = LocalTime.now();
//        System.out.println(rs);

        DateTimeFormatter cr = DateTimeFormatter.ofPattern("HH:mm:ss");
        String mr = rs.format(cr);
//        System.out.println(mr);

        //Que 3 - Repeat que 2 using calendar class
        Calendar cv = Calendar.getInstance();
//        System.out.println(Calendar.HOUR);
//        System.out.print(cv.get(Calendar.HOUR) + ":");
//        System.out.print(cv.get(Calendar.MINUTE) + ":");
//        System.out.print(cv.get(Calendar.SECOND));

        //Que 4 - Repeat que 2 by java.time
        LocalTime tm =  LocalTime.now();
//        System.out.println(tm);

        //Que 5
        HashSet<Integer> crx = new HashSet<Integer>();
        crx.add(1);
        crx.add(2);
        crx.add(3);
        crx.add(4);
        crx.add(5);
        crx.add(3);
        crx.add(21);
        crx.add(1);
        crx.add(5);
        crx.add(7);
        System.out.println(crx);

    }
}
