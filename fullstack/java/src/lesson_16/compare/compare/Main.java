package lesson_16.compare.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        compareTest();
    }

    private static void compareTest() {
        Person p1 = new Person("Mike", "Sagi", 4);
        Person p2 = new Person("Tomer", "Sagi", 2);
        Person p3 = new Person("Roi", "Sagi", 1);
        Person p4 = new Person("John", "Sagi", 3);

        ArrayList<Person> family = new ArrayList<>(List.of(p1, p2, p3, p4));

        System.out.println("\nUnsorted:");
        for (Person p : family) {
            System.out.println(p);
        }

        // Sort by the default 'compareTo()' method (exists in Comparable)
//        Collections.sort(family);

        // Sort using a firstName comparator ('compare' method exists in Comparator)
        Collections.sort(family, new FirstNameComparator());

        System.out.println("\nSorted by 'FirstNameComparator':");
        for (Person p : family) {
            System.out.println(p);
        }

        // Sort using a siblingOrder comparator
        Collections.sort(family, new SiblingOrderComparator());

        System.out.println("\nSorted by 'SiblingOrderComparator':");
        for (Person p : family) {
            System.out.println(p);
        }
    }
}
