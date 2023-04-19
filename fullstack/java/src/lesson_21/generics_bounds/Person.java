package lesson_21.generics_bounds;

import org.jetbrains.annotations.NotNull;

public class Person
        extends Number
        implements Comparable<Person> {

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    @Override
    public int compareTo(@NotNull Person person) {
        return 0;
    }
}
