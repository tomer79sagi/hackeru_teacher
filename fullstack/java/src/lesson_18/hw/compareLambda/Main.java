package lesson_18.hw.compareLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        compareTest();
    }

    private static void compareTest() {
        Person p1 = new Person("Mike", "Sagi", 4, 23);
        Person p2 = new Person("Tomer", "Sagi", 2, 11);
        Person p3 = new Person("Roi", "Sagi", 1, 11);
        Person p4 = new Person("John", "Sagi", 3, 15);
        Person p5 = new Person("John", "George", 2, 11);

        ArrayList<Person> family = new ArrayList<>(List.of(p1, p2, p3, p4, p5));

        System.out.println("\nUnsorted:");
        for (Person p : family) {
            System.out.println(p);
        }

        // Lesson 18 - Solution
        // ------------------------

        // 1. Sort using a lastName comparator
        // Functional interface -> Method reference instead of Lambda expression
        Comparator<Person> compare3 = Comparator.comparing(Person::getLastName);
        family.sort(compare3); // List 'interface' as an abstract method called sort(Comparator)
//        Collections.sort(family, compare3); // Plural 'CollectionS' - has a utility method called 'sort'
        System.out.println("\nSorted by 'LastNameComparator':");
        family.forEach(System.out::println);

        // 2. Sort based on age
        Comparator<Person> compare4 = Comparator.comparing(Person::getAge);
        family.sort(compare4); // List 'interface' as an abstract method called sort(Comparator)
        System.out.println("\nSorted by 'AgeComparator':");
        family.forEach(System.out::println);

        // 3. Sort based on age, siblingOrder, familyName
        Comparator<Person> compare5 = compare4.
                thenComparing(Comparator.comparing(Person::getSiblingOrder)).
                thenComparing(compare3);
        family.sort(compare5);
        System.out.println("\nSorted by 'Age', 'SiblingOrder' and 'LastName':");
        family.forEach(System.out::println);
    }
}
