package lesson_27.navigable_set;

import java.util.*;

public class MyNavSet {
    public static void main(String[] args) {
        NavigableSet<Integer> ns = new TreeSet<>(List.of(5, 20, 23, 55, 44));

        System.out.println(ns.headSet(20, true));
        System.out.println(ns.tailSet(20, true));

        System.out.println(ns.higher(22));
        System.out.println(ns.lower(23));

        System.out.println(ns.ceiling(19));
        System.out.println(ns.floor(55));

//        System.out.println(ns.pollFirst()); // 5
//        System.out.println(ns.pollLast()); // 55
//        System.out.println(ns.pollFirst()); // 20

        System.out.println(ns.descendingSet());

        System.out.println("Iterator");
        Iterator<Integer> ii = ns.iterator();

        while (ii.hasNext()) {
            System.out.println(ii.next());
        }

        // clear
        System.out.println("Clear");
        ns.clear();
        System.out.println(ns);
    }
}
