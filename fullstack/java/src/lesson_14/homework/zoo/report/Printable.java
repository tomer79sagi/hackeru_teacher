package lesson_14.homework.zoo.report;
public interface Printable {
    default void print() {
        System.out.println("This is the default implementation");
    }
}
