package lesson_18.mutable_immutable;

// Immutable
public class Person1 {

    private final String name;

    Person1(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Person1 p = new Person1("Michael Jordan");
//        p = new Person1("Magic Johnson"); // Creates a new object in memory

        Person1 p2 = p; // p2 = p

        System.out.println("p1: " + p);
        System.out.println("p2: " + p2);
    }

    public String getName() {
        return name;
    }



    public String toString() {
        return name;
    }
}
