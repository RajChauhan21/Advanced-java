package Advanced_java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CH15_Date_Time_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
//        System.out.println(dt);

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("dd/MM/yyyy");//Prints the date in formatted order
        DateTimeFormatter tft = DateTimeFormatter.ISO_LOCAL_DATE; // Prints the date in formatted order
//        DateTimeFormatter fr = DateTimeFormatter.ISO_LOCAL_TIME;
//        System.out.println(fr);
        String xr = dt.format(tf);
        System.out.println(xr);
    }
}
