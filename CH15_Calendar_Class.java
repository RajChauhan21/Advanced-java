package Advanced_java;

import java.util.Calendar;
import java.util.TimeZone;

public class CH15_Calendar_Class {
    public static void main(String[] args) {
        //Calendar is an abstract class
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Calcutta"));
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());
//        System.out.println(c.getFirstDayOfWeek());
        System.out.println(c.getTime());

        System.out.println(Calendar.getAvailableCalendarTypes());
//        System.out.println(Calendar.getAvailableLocales());
//        System.out.println(c.getWeekYear());
//        System.out.println(c.getWeeksInWeekYear());
//        System.out.println(c.isLenient());
//        System.out.println(c.hashCode());
//        System.out.println(c.isWeekDateSupported());
//        System.out.println(c.toString());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
//        System.out.println(c.get(Calendar.OCTOBER));
        System.out.println(c.get(Calendar.DATE));
//        System.out.println(c.get(Calendar.MINUTE));
        System.out.print("Train no. 12334 LTT-LUCKNOW departing from station no.3 at ");
        System.out.println(c.get( + Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) );





    }
}
