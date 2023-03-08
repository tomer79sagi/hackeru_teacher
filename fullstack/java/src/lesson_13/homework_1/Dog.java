package lesson_13.homework_1;

public class Dog extends Animal implements Printable, Sortable {
    String furType;

    // Secondary / service constructor
    //
    public Dog(String name) {
        this(name, "Regular"); // Call the primary constructor
    }

    // Primary constructor
    // 1. Contains ALL minimum attributes for full functionality
    // 2. ONLY one to call super constructors
    // 3. Contains ALL logic to create a DOG object
    public Dog(String name, String furType) {
        // All new dog logic will be here!
        super(name);
        this.furType = furType;
    }

    public void print() {
        System.out.println("Printing Dog");
    }

    @Override
    public void sort() {

    }
}
