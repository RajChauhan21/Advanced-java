package Advanced_java;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CH15_Gregorian_Calendar_Class {
    public static void availableid(int a){
        if(a==500){
            System.out.println(TimeZone.getAvailableIDs()[a]);
            return;
        }
        System.out.println(TimeZone.getAvailableIDs()[a]);
        availableid(a+1);
    }

    public static void main(String[] args) {
        GregorianCalendar cl = new GregorianCalendar();
        TimeZone fr = new TimeZone() {
            @Override
            public int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds) {
                return 0;
            }

            @Override
            public void setRawOffset(int offsetMillis) {

            }

            @Override
            public int getRawOffset() {
                return 0;
            }

            @Override
            public boolean useDaylightTime() {
                return false;
            }

            @Override
            public boolean inDaylightTime(Date date) {
                return false;
            }
        };
//        System.out.println(cl.isLeapYear(2046));
//        System.out.println(2046%4);
////        System.out.println(cl.getAvailableYears());


//
//        for(int  i=0;i<=50;i++){
//            System.out.println(TimeZone.getAvailableIDs()[i]);
//        }
//        availableid(0);
        

    }
}
