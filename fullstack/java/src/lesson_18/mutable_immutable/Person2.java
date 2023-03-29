package lesson_18.mutable_immutable;

// Immutable
public class Person2 {

    private String name;

    Person2(String name) {
        this.name = name;
    }

    // Copy constructor
    // Go through all attributes and copy them one-by-one
    Person2(Person2 p) {
        this.name = p.getName();
    }
    public static void main(String[] args) {
        Person2 p = new Person2("Michael Jordan");
//        p = new Person1("Magic Johnson"); // Creates a new object in memory

        Person2 p2 = p; // p2 = p

        System.out.println("p1: " + p);
        System.out.println("p2: " + p2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String toString() {
        return getName();
    }
}
