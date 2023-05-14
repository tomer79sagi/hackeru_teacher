package lesson_27.sorted_set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MySortedSet {
    public static void main(String[] args) {
//        test1();
        test2();
    }


    private static void test2() {
        Comparator<Person> cAge = (p1, p2) -> p1.getAge() - p2.getAge();
        SortedSet<Person> ss = new TreeSet<>(cAge);

        ss.add(new Person("Tomer", 34));
        ss.add(new Person("Jordan", 22));
        ss.add(new Person("Mike", 19));
        ss.add(new Person("John", 88));
        ss.add(new Person("Sagi", 5));

        System.out.println(ss);
        System.out.println(ss.comparator()); // Null
    }

    private static void test1() {
        SortedSet<Integer> ss = new TreeSet<>();

        ss.add(34);
        ss.add(22);
        ss.add(19);
        ss.add(88);
        ss.add(5);

        System.out.println(ss);
        System.out.println(ss.comparator()); // Null

        System.out.println(ss.first()); // 5
        System.out.println(ss.last()); // 88

        System.out.println(ss.tailSet(19)); // Include first, doesn't include last element
        System.out.println(ss.headSet(22)); // Include first, doesn't include last element

        System.out.println(ss.subSet(19, 34));
    }
}
