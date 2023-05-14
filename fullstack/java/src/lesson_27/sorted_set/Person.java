package lesson_27.sorted_set;

import lesson_26.hw.NameTooShortException;
import org.jetbrains.annotations.NotNull;

public class Person
    implements Comparable<Person> {
    private String firstName;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }

    // Constructor
    public Person(String firstName, int age) {
        try {
            this.setFirstName(firstName);
            this.setAge(age);
        } catch(NameTooShortException e) {
            System.out.println(e);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NameTooShortException {
        if (firstName == null || firstName.equals(""))
            throw new NameTooShortException("Can't provide null or empty String.");

        this.firstName = firstName;
    }

    @Override
    public int compareTo(@NotNull Person person) {
        return getFirstName().compareTo(person.getFirstName());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
