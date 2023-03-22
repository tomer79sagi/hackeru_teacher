package lesson_17.immutable_objects;

public class Immutable {
    public static void main(String[] args) {
        Integer n = 7;
        String name = "Tomer";

        n = 8;
        name = "Sagi";

        System.out.println(name);
    }
}
