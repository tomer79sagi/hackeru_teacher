package lesson_16.compare.compare;

import java.util.Comparator;

public class SiblingOrderComparator
        implements Comparator<Person> {


    @Override
    public int compare(Person person, Person t1) {
        return person.getSiblingOrder() - t1.getSiblingOrder();
    }
}
