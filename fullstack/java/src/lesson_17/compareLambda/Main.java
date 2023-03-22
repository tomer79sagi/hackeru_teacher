package lesson_17.compareLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Mike", "Sagi", 4);
        Person p2 = new Person("Tomer", "Sagi", 2);
        Person p3 = new Person("Roi", "Sagi", 1);
        Person p4 = new Person("John", "Sagi", 3);

        ArrayList<Person> family = new ArrayList<>(List.of(p1, p2, p3, p4));

//        compareTest(family);
        consumerTest(family);
    }

    private static void consumerTest(ArrayList<Person> family) {
        // Combining two concepts: Functional Interface + Lambda Expression
        Consumer<Person> consumerPrinter = p -> System.out.println(p);
        Consumer<String> stringPrinter = p -> System.out.println(p);
        Predicate<Person> cFilter1 = p -> p.getSiblingOrder() > 1;

        // These two lines are exactly the same
//        Function<Person, String> firstNameMap = p -> p.getFirstName();

        // Combining two concepts: Functional Interface + Method Reference
        Function<Person, String> firstNameMap = Person::getFirstName;

        family.forEach(consumerPrinter);
        family.forEach(p -> System.out.println(p));

        family.stream().filter(cFilter1).forEach(consumerPrinter);
        family.stream().filter(p -> p.getSiblingOrder() > 1).forEach(consumerPrinter);

        family.stream().map(p -> p.getFirstName()).forEach(stringPrinter);
        family.stream().map(firstNameMap).forEach(stringPrinter);
        family.stream().map(firstNameMap).forEach(stringPrinter);
    }

    private static void compareTest(ArrayList<Person> family) {
        System.out.println("\nUnsorted:");
        for (Person p : family) {
            System.out.println(p);
        }

        // Sort using a firstName comparator
        Comparator<Person> compare1 = (person1, person2) -> person1.getFirstName().compareTo(person2.getFirstName());
        Collections.sort(family, compare1);
        System.out.println("\nSorted by 'FirstNameComparator':\n" + family);

        // Sort using a siblingOrder comparator
        Comparator<Person> compare2 = (person1, person2) -> person1.getSiblingOrder() - person2.getSiblingOrder();
        Collections.sort(family, compare2);
        System.out.println("\nSorted by 'SiblingOrderComparator':\n" + family);
    }
}
