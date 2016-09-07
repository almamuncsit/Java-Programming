package strings;

public class Strings {

    public static void main(String[] args) {
        String str = "Hello word ";
        System.out.println(str);

        char[] charArray = {'a', 'b', 'c', 'd'};
        String str1 = new String(charArray);
        System.out.println(str1);

        System.out.println("Length : " + str.length());
        String str2 = str.concat(str1);
        System.out.println(str2);
        System.out.println("This is : " + str2);

        double floatVar = 154.46;
        int intVar = 1545;
        String stringVar = "How do you do";
        String fs;
        fs = String.format("The value of the float variable is "
                + "%f, while the value of the integer "
                + "variable is %d, and the string "
                + "is %s", floatVar, intVar, stringVar);
        System.out.println(fs);
    }

}
