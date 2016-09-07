
package pkg08.character;

public class Methods {
    public static void main(String[] args) {
        System.out.println(Character.isLetter('p'));
        System.out.println(Character.isLetter('5'));
        
        System.out.println(Character.isDigit('p'));
        System.out.println(Character.isDigit('5'));
        
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('5'));
        
        System.out.println(Character.isUpperCase('o'));
        System.out.println(Character.isUpperCase('O'));
        
        System.out.println(Character.isLowerCase('O'));
        System.out.println(Character.isLowerCase('i'));
        
        System.out.println(Character.toUpperCase('i'));
        System.out.println(Character.toLowerCase('P'));
        System.out.println(Character.toString('w'));
    }
}
