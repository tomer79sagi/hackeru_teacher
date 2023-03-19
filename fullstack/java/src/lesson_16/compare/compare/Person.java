package lesson_16.compare.compare;

public class Person
        implements Comparable<Person> {

    private String firstName;
    private String lastName;

    private int siblingOrder;

    public Person(String firstName, String lastName, int siblingOrder) {
        setFirstName(firstName);
        setLastName(lastName);
        setSiblingOrder(siblingOrder);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSiblingOrder() {
        return siblingOrder;
    }

    public void setSiblingOrder(int siblingOrder) {
        this.siblingOrder = siblingOrder;
    }

    @Override
    public int compareTo(Person person) {
        int diff = firstName.compareTo(person.firstName);
        if (diff != 0) return diff;

        diff = lastName.compareTo(person.lastName);
        if (diff != 0) return diff;

        return siblingOrder - person.siblingOrder;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", siblingOrder=" + siblingOrder +
                '}';
    }
}
