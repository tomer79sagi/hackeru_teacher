package lesson_21.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Inheritence {
    public static void main(String[] args) {
//        List<Integer> l = List.of(1,2,3);
//        print(l);

//        List<Integer> l = new ArrayList<Integer>(List.of(1,2,3));
//        List<Number> l = new ArrayList<>(List.of(0.4f,0.4f,0.4f));
        List<Float> l = new ArrayList<>(List.of(0.4f,0.4f,0.4f)); // Conflicts with the lower bounds
        fillNumbers(l);
    }

    public static <T extends Number> void print(List<T> numbers) {
        numbers.forEach(n -> System.out.println(n.intValue() + 1));
    }

    public static void fillNumbers(List<? super Integer> l) {
        for (int i = 0; i < 10; i++) {
            l.add(i);
        }

        System.out.println(l);
    }
}
