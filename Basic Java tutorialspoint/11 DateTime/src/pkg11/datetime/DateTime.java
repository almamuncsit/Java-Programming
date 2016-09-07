
package pkg11.datetime;

import java.util.*;
import java.text.*;

public class DateTime {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        
        SimpleDateFormat st = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zz");
        
        System.out.println(st.format(date));
        
        System.out.printf("%1$s %2$tB %2$td, %2$tY \n", "Due date:", date);
        
        SimpleDateFormat ft = new SimpleDateFormat("yyyyy-MM-dd");
        Date t;
        String strDate = "2016-10-15";
        try {
            t = ft.parse(strDate);
            System.out.println(t);
        } catch (Exception e) {
            System.out.println("Unparseable using : " + strDate);
        }
        
    }
    
}
