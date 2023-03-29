package lesson_18.mutable_immutable;

// Ticket is 100% immutable (because I create a new copy of 'Person2' when the 'getter' is used
public class Ticket {

    private final Person2 person;

    Ticket(Person2 person) {
        this.person = person;
    }

    public Person2 getPerson() {
        return new Person2(person);
    }
}
