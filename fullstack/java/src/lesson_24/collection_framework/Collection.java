package lesson_24.collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
//        run1();
        run2();
    }

    private static void run2() {
        // Iterable has the 'iterator()' method that returns a new 'Iterator'
        Iterable<Integer> lst = List.of(1, 2, 3);
        lst.forEach(System.out::println);
        for (Integer integer : lst) {
            System.out.println(integer);
        }

        // Extract iterator and perform the 'while...hasNext()' concept
        Iterator<Integer> i = lst.iterator();
        while (i.hasNext()) {
            Integer num = i.next();
            System.out.println(num);
        }
    }

    private static void run1() {
        List<Integer> c = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        for (int i = 0; i < 3; i++) {
            c.add(i);
        }

        System.out.println(c);//[1, 2, 3, 4, 5, 0, 1, 2]
    }
}
