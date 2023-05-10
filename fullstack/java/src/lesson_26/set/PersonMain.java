package lesson_26.set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class PersonMain {
    public static void main(String[] args) {
        //we can define an external Comparator:
        Comparator<Person> comp1 = (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName());
        Comparator<Person> comp2 = Comparator.comparing(Person::getFirstName);
        Comparator<Person> comp3 = Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName);
        //use it with the TreeSet:
        SortedSet<Person> people = new TreeSet<>(comp1);
        people.add(new Person("John", "Papa"));
        people.add(new Person("John", "Doe"));
        System.out.println(people);
    }
}
