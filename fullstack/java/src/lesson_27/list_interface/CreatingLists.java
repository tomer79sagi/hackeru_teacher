package lesson_27.list_interface;

import java.util.Arrays;
import java.util.List;

public class CreatingLists {
    public static void main(String[] args) {
        List<Integer> i1 = List.of(2, 3, 4, 5, 6, 7, 8, 9); // Immutable list
        List<Integer> i2 = List.copyOf(i1); // Creates immutable list
        List<Integer> i3 = Arrays.asList(1,2,3,4,5,5,6); // Creates a List that behaves like a regular Array (fixed size)
        i3.add(45);
        i3.remove(99);
    }
}
