
package collectionsframework;

import java.util.*;
public class HashSetDemo {

   public static void main(String args[]) {
      // create a hash set
      HashSet hs = new HashSet();
      
      // add elements to the hash set
      hs.add("B");
      hs.add("A");
      hs.add("D");
      hs.add("E");
      hs.add("C");
      hs.add("F");
      hs.add("A");
      System.out.println(hs);
      
      
      // create a hash set
      LinkedHashSet lhs = new LinkedHashSet();
      
      // add elements to the hash set
      lhs.add("B");
      lhs.add("A");
      lhs.add("D");
      lhs.add("E");
      lhs.add("E");
      lhs.add("C");
      lhs.add("F");
      System.out.println(lhs);
   }
}
