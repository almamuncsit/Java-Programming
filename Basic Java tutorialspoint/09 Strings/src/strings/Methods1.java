package strings;

public class Methods1 {

    public static void main(String[] args) {
        String str = "   Hello word ";
        String str1 = "Hello how char how are you";
        char[] charArray = {'h', 'o', 'w', ' ', 'a', 'r', 'e', ' ', 'y', 'o', 'u'};
        String str4 = "";

        System.out.println(str.indexOf('o'));
        System.out.println(str.lastIndexOf('o'));

        System.out.println(str.indexOf("word"));
        System.out.println(str1.indexOf("how", 10));

        System.out.println(str1.intern());

        System.out.println(str1.matches("(.*)how (.*)"));

        System.out.println(str1.replace('o', 'A'));
        System.out.println(str1.replace("how", "What"));
        System.out.println(str1.replaceFirst("how", "What"));

        System.out.println(str1.startsWith("Hello"));
        System.out.println(str1.startsWith("Hello", 12));

        System.out.println(str1.subSequence(10, 25));
        System.out.println(str1.substring(10, 20));

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println(str.toString());
        System.out.println(str.trim());

        double d = 102939939.939;
        boolean b = true;
        long l = 1232874;
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        
        String srtd = String.valueOf(d);

        System.out.println("Return Value : " + srtd);
        System.out.println("Return Value : " + String.valueOf(b));
        System.out.println("Return Value : " + String.valueOf(l));
        System.out.println("Return Value : " + String.valueOf(arr));

    }
}
