package collectionsframework;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("name", "Sarkar");
        m.put("id", "15-54-454411");
        m.put("roll", 56565);

        System.out.println(m.containsKey("id"));
        System.out.println(m.containsValue("Sarkar"));

        System.out.println(m.get("id"));
        System.out.println("Size is : " + m.size());
        System.out.println(m.values());

        System.out.println(m);
        System.out.println();

        Set s = m.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}
