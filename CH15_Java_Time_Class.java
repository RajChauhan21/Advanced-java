package Advanced_java;

import java.time.*;

public class CH15_Java_Time_Class {
    public static void main(String[] args) {
        //classes in the java.time. package has the private access so we can't create object of those classes

        // Returns date
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        // Returns time
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        //Returns both
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

    }
}
