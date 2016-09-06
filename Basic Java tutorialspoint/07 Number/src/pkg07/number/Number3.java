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
public class Number3 {

    public static void main(String[] args) {
        System.out.println(Math.min(12.123, 12.456));
        System.out.println(Math.min(23.12, 23.0));

        double x = 50;
        double y = 2;

        System.out.printf("The value of e is %.4f%n", Math.E);
        System.out.printf("log(%.3f) is %.3f%n", x, Math.log(x));

        System.out.printf("pow(%.3f, %.3f) is %.3f%n", x, y, Math.pow(x, y));
        
        System.out.printf("sqrt(%.3f) is %.3f%n", x, Math.sqrt(x));
    }
}
