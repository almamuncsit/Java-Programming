/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06.condition;

/**
 *
 * @author mamun
 */
public class nastedIfElse {
    public static void main(String[] args) {
        int a = 5;
        if (a > 5) {
            System.out.println("A is larger 5");
        } else if (a == 5){
            System.out.println("A is 5");
        } else if(a < 5) {
            System.out.println("A is Smaller then 5");
        }
    }
}
