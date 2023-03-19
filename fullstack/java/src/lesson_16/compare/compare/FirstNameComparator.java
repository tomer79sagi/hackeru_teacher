package lesson_16.compare.compare;

import java.util.Comparator;

public class FirstNameComparator
        implements Comparator<Person> {


    @Override
    public int compare(Person person, Person t1) {
        return person.getFirstName().compareTo(t1.getFirstName());
    }
}
