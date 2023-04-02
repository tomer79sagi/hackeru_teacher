package lesson_19.mutable_immutable;

public class Main {
    public static void main(String[] args) {
        // immutable
        String name = "Tomer"; // ==> new String("Tomer");

        // String is immutable
        // Creates a new object and assigns the memory for it. "Tomer" is completely removed
        // ==> name = new String("Sagi");
        name = "Sagi";

        // Integer is immutable also
        Integer age = 23; // ==> new Integer(23);
        age = 45; // ==> new Integer(45);
    }
}
