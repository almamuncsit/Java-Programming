
package regularexpressions;
import java.util.regex.*;

public class RegexMatches {
    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";
    
    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);
        int count = 0;
        
        System.out.println("lokingAt() : " + m.lookingAt());
        System.out.println("matches() : " + m.matches());
        
        System.out.println("replaceAll() : " + m.replaceAll("Dog"));
        System.out.println("replaceFirst() : " + m.replaceFirst("Dog"));
       
        while (m.find()) {            
            count++;
            System.out.println("Matcher Number : " + count);
            System.out.println("Start() : " + m.start());
            System.out.println("end() : " + m.end());
        }
        
    }
}
