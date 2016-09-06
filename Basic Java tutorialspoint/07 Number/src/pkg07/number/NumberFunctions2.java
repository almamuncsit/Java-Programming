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
public class NumberFunctions2 {

    public static void main(String[] args) {
        Integer x = 5;
        System.out.println(x.toString());
        System.out.println(Integer.toString(12));
        
        String s = "486";
        System.out.println(Integer.parseInt(s));
        
        
        Integer p = -465;
        System.out.println(Math.abs(p));
        
        double n = 4847.48;
        System.out.println(Math.ceil(n));
        System.out.println(Math.floor(n));
        
        System.out.println(Math.rint(45.525));
        
        System.out.println(Math.round(45.525));
        
    }
}
