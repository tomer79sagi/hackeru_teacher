package lesson_27.map_obj;

import java.util.*;

public class MyMap {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    private static void test2() {
        NavigableMap<String, String> nm = new TreeMap<>(
            Map.of(
                "Haifa", "Tomer",
                "Tel Aviv", "Michael",
                "Rishon", "Shimon"
        ));

        System.out.println(nm.tailMap("Tel Aviv", true)); // {Tel Aviv=Michael}
        System.out.println(nm.headMap("Tel Aviv", true)); // {Haifa=Tomer, Rishon=Shimon, Tel Aviv=Michael}
    }

    private static void test1() {
        SortedMap<String, String> sm = new TreeMap<>();
        sm.put("Haifa", "Tomer");
        sm.put("Tel Aviv", "Michael");
        sm.put("Rishon", "Shimon");

//        SortedMap<String, String> sm = new TreeMap<>(
//            Map.of(
//                "Haifa", "Tomer",
//                "Tel Aviv", "Michael",
//                "Rishon", "Shimon"
//        ));

        System.out.println(sm);
        System.out.println(sm.tailMap("Tel Aviv"));
        System.out.println(sm.headMap("Tel Aviv"));

        // Use keys for iteration
        Set<String> keys = sm.keySet();
        Iterator<String> itr = keys.iterator();
        while (itr.hasNext()) {
            System.out.println("Next: " + itr.next());
        }

        // Use values for iterations
        Collection<String> values = sm.values();
        Iterator<String> itr2 = values.iterator();
        while (itr2.hasNext()) {
            System.out.println("Next: " + itr2.next());
        }

        // Extract both keys and values as Entries
        // 'Map.Entry' means that 'Entry' is an inner interface that is public
        Set<Map.Entry<String, String>> es = sm.entrySet();
        Iterator<Map.Entry<String, String>> itr3 = es.iterator();
        while (itr3.hasNext()) {
            Map.Entry<String, String> entry = itr3.next();
            System.out.println("Next: " + entry.getKey() + " | " + entry.getValue());
        }
    }
}
