package lesson_17.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        compareTest();
        comparingThen();
    }

    private static void comparingThen() {
        Person p1 = new Person("Mike", "Sagi", 4);
        Person p2 = new Person("Tomer", "Sagi", 2);
        Person p3 = new Person("Tomer", "Sagi", 1);
        Person p4 = new Person("John", "George", 3);

        ArrayList<Person> family = new ArrayList<>(List.of(p1, p2, p3, p4));

        Comparator<Person> compare4 = Comparator.comparing(Person::getLastName);

        // We can chain / aggregate Comparators one after the other?
        // Similar to stream().
        Comparator<Person> compareFinal = compare4.
                thenComparing(Comparator.comparing(Person::getFirstName)).
                thenComparing(Comparator.comparing(Person::getSiblingOrder)).
                thenComparing(Comparator.comparing(p -> p.getFirstName().length() - 2));

        family.sort(compareFinal);
//        Collections.sort(family, compareFinal);

        family.forEach(System.out::println);

        family.
                stream().
                filter(p -> p.getSiblingOrder() > 1).
                map(p -> p.getFirstName()).
                filter(p -> p.length() > 5).
                forEach(System.out::println);

//        family.sort(compare4).
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
        // : 4 ways of creating a 'Comparator' implementation (short form, without creating a new Class)
        // - Using Functional Interface (aka anonymous function)
        Comparator<Person> compare1 = (person1, person2) -> person1.getFirstName().compareTo(person2.getFirstName());

        // - Comparing with method reference
        Comparator<Person> compare4 = Comparator.comparing(Person::getFirstName);

        // - Comparing with lambda function (without explicit type)
        Comparator<Person> compare2 = Comparator.comparing(p -> p.getFirstName());

        // - Comparing with lambda function (with explicit type)
        Comparator<Person> compare3 = Comparator.comparing((Person p) -> p.getFirstName());


        // Sort using the 'List' sort method
        family.sort(compare1);

        // Sort using the 'Collections.sort' method
        Collections.sort(family, compare1);

        System.out.println("\nSorted by 'FirstNameComparator':\n" + family);

        // Sort using a siblingOrder comparator
        Comparator<Person> compare5 = (person1, person2) -> person1.getSiblingOrder() - person2.getSiblingOrder();
        Collections.sort(family, compare2);
        System.out.println("\nSorted by 'SiblingOrderComparator':\n" + family);
    }
}
