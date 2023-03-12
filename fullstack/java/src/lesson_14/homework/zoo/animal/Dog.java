package lesson_14.homework.zoo.animal;

import lesson_14.homework.zoo.report.IReport;
import lesson_14.homework.zoo.report.Printable;

public class Dog
        extends Animal {
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

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
