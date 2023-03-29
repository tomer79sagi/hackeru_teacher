package lesson_18.records;

// 'Record' provides an easy implementation of standard methods:
// Boilerplate code
// Constructor, equals(), hashCode(), toString(), getters
public record Student(String firstName, String lastName)
        implements Runnable {

    // Override default constructor
    // = Canonical constructor (contains all attributes)
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println(this);
    }

    @Override
    public void run() {
        System.out.println(firstName + " is running");
    }
}
