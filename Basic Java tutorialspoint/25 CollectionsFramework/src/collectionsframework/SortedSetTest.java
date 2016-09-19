package collectionsframework;

import java.util.*;

public class SortedSetTest {

    public static void main(String[] args) {
        SortedSet set = new TreeSet();
        set.add("d");
        set.add("c");
        set.add("a");
        set.add("b");
        
        System.out.println("First element  : " + set.first());
        
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            System.out.println(next.toString());
        }
    }
}
