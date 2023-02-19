package lesson_8;

// CLASS = TEMPLATE, a GHOST
public class Animal {

    // A) PROPERTIES
    public static String firstAnimalFound = "20000BC";

    String type;

    String color;

    int legs;

    // B) CONSTRUCTORS
    public Animal(String type, String color, int legs) {

    }

    // C) MAIN method (ONLY if this where we start the program)
    public static void main(String[] args) {
        // NON-STATIC => only OBJECT can access (only after 'new')
        Animal giraffe = new Animal("Giraffe", "Yellow", 4);
        Animal dog = new Animal("Dog", "Black", 4);
        Animal monkey = new Animal("Monkey", "Brown", 2);
//        monkey.printFirstYearFounded(); // ==> ERROR!

        // STATIC => only CLASS can access (CANNOT access using 'new')
        System.out.println(Animal.firstAnimalFound);
        Animal.printFirstYearFounded();
    }

    // D) METHODS
    public static void printFirstYearFounded() {
        System.out.println(firstAnimalFound);
    }

    public void eat() {

    }

    public void walk() {

    }

    public void makeSound() {

    }
}
