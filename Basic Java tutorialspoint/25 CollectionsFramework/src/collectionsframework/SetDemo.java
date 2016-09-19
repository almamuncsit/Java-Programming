
package collectionsframework;

import java.util.*;
public class SetDemo {

  public static void main(String args[]) { 
      int count[] = {10, 41, 20, 41, 80, 90, 10};
      Set<Integer> set = new HashSet<Integer>();
      
      try {
          for (int i = 0; i < 6; i++) {
              set.add(count[i]);
          }
          System.out.println(set);
          
          TreeSet sortedSet = new TreeSet<Integer>(set);
          System.out.println("Sorted list is : \n" + sortedSet);
          
          System.out.println("First element : " + sortedSet.first());
          System.out.println("Last element : " + sortedSet.last());
          
      } catch (Exception e) {
      }
      
   }
} 