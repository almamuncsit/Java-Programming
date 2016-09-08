
package strings;

public class Methods {
    public static void main(String[] args) {
        String str = "Hello word";
        String str1 = "Hello char how are ou";
        char[] charArray = {'h', 'o', 'w', ' ', 'a', 'r', 'e', ' ', 'y', 'o', 'u'};
        String str4 = "";
        str4 = str4.copyValueOf(charArray);
        
        System.out.println(str.charAt(1));
        System.out.println(str.compareTo(str1));
        System.out.println(str1.compareTo(str));
        
        
        System.out.println(str.compareToIgnoreCase(str1));
        
        StringBuffer str3 = new StringBuffer( "Hello word");
        System.out.println(str.contentEquals(str3));
        
        System.out.println(str4);
        System.out.println(str4.copyValueOf(charArray, 4, 3));
        
        System.out.println(str.endsWith("word"));
        
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase("HELLO WORD"));
        
        byte[] strByte = str.getBytes();
        System.out.println(strByte);
        str1.getChars(6, 11, charArray, 4);
        System.out.println(charArray);
        
        
        System.out.println(str.hashCode());
        
        
    }
}
