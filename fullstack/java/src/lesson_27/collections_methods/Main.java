package lesson_27.collections_methods;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    private static void test2() {
        Set<String> s1 = new HashSet<>(Set.of("Michael", "John", "Magic"));
        Set<String> s2 = new HashSet<>(Set.of("Michael", "Jeff", "Shimon", "Tomer"));

        System.out.println(Sets.union(s1, s2)); // .addAll() - [Shimon, Michael, Magic, John, Jeff, Tomer]
        System.out.println(Sets.intersection(s1, s2)); // .retainAll() - [Michael]
        System.out.println(Sets.difference(s1, s2)); // .removeAll() - [Magic, John]
        System.out.println(Sets.symmetricDifference(s1, s2)); // symmetricDifference() - [Shimon, Magic, John, Jeff, Tomer]
    }

    private static void test1() {
        List<String> ls = new ArrayList<>();

        ls.add("Tomer");
        ls.add("John");
        ls.add("Smith");

        System.out.println(Collections.max(ls)); // Tomer
        System.out.println(Collections.min(ls)); // John

        // Tomer, John, Smith
        Collections.rotate(ls, 1); // Smith, Tomer, John
        System.out.println(ls);

        Collections.rotate(ls, 1); // John, Smith, Tomer
        System.out.println(ls);

        Collections.rotate(ls, 2); // Smith, Tomer, John
        System.out.println(ls);

        Collections.swap(ls, 0, 1); //
        System.out.println(ls);
    }
}
