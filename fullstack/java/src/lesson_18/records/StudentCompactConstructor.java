package lesson_18.records;

// 'Record' provides an easy implementation of standard methods:
// Boilerplate code
// Constructor, equals(), hashCode(), toString(), getters
public record StudentCompactConstructor(String firstName, String lastName)
        implements Runnable {

    // Override default constructor
    // = Canonical constructor (contains all attributes) = Primary constructor
    public StudentCompactConstructor {
        if (firstName.length() < 4) {
            throw new RuntimeException("FirstName is too short");
        }
    }

    // Secondary constructor
    public StudentCompactConstructor(String firstName) {
        this(firstName, "Sagi");
    }

    @Override
    public void run() {
        System.out.println(firstName + " is running");
    }
}
