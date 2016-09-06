/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07.number;

/**
 *
 * @author mamun
 */
public class Number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer x = 50;
       
        System.out.println(x.byteValue());
        System.out.println(x.shortValue());
        System.out.println(x.doubleValue());
        System.out.println(x.floatValue());
        
        System.out.println(x.compareTo(30));
        System.out.println(x.compareTo(50));
        System.out.println(x.compareTo(60));
        
        
        System.out.println(x.equals(50));
    }
    
}
