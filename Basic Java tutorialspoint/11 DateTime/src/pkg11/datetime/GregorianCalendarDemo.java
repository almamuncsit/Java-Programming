
package pkg11.datetime;

import java.util.*;
import sun.util.calendar.Gregorian;

public class GregorianCalendarDemo {
    public static void main(String[] args) {
        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", 
         "Oct", "Nov", "Dec"};
        int year;
        
        
        GregorianCalendar gcalender = new GregorianCalendar();
        
        System.out.println(months[gcalender.get(Calendar.MONTH)]);
        System.out.println(gcalender.get(Calendar.DATE));
        System.out.println(gcalender.get(Calendar.YEAR));
        
        System.out.println(gcalender.get(Calendar.HOUR));
        System.out.println(gcalender.get(Calendar.MINUTE));
        System.out.println(gcalender.get(Calendar.SECOND));
        
        System.out.println(gcalender.isLeapYear(Calendar.YEAR));
        
    }
}
