package lesson_16.compare.compareLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        // Sort using a firstName comparator
        Comparator<Person> compare1 = (person1, person2) -> person1.getFirstName().compareTo(person2.getFirstName());
        family.stream().
        Collections.sort(family, compare1);
        System.out.println("\nSorted by 'FirstNameComparator':\n" + family);

        // Sort using a siblingOrder comparator
        Comparator<Person> compare2 = (person1, person2) -> person1.getSiblingOrder() - person2.getSiblingOrder();
        Collections.sort(family, compare2);
        System.out.println("\nSorted by 'SiblingOrderComparator':\n" + family);
    }
}
