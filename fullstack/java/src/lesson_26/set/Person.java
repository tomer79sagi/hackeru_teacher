package lesson_26.set;

import java.util.Objects;
import java.util.StringJoiner;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    //ctor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //getters:
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    //toString
    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .toString();
    }
    //Comparable implementation
    @Override
    public int compareTo(Person o) {
        var diff = firstName.compareTo(o.firstName);
        if (diff != 0) return diff;
        return lastName.compareTo(o.lastName);
    }
    //Object methods for sets and maps:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
