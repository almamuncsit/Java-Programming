
package pkg11.datetime;

import java.util.*;

public class SleepDemo {
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            
            System.out.println("Date : " + new Date());
            Thread.sleep(5*60*10);
            System.out.println("Date : " + new Date());
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("Different is : " + diff);
        
            
        } catch (Exception e) {
            System.out.println("Got an Exception");
        }
    }
}
