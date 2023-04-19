package lesson_21.generics_bounds;

import java.util.List;

public class MathG {
    // Method that EXTENDS class Number
    private static <T extends Number> double sum(List<T> list) {
        double sum = 0;

        for (T t : list) {
            sum += t.doubleValue();
        }

        return sum;
    }

    private static double sum2(List<?> list) {
        double sum = 0;

        System.out.println("Sum is great");

        return sum;
    }

    // Method that IMPLEMENTS interface Comparable
    // 'extends' in Generics means both 'extends' and 'implements' from regular inheritence
    public static <E extends Comparable<E>> int countLargerThan(List<E> list, E value) {
        int count = 0;

        for (E element : list) {
            if (element.compareTo(value) > 0)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        List<Number> l = List.of(1,2,3,4,5,5,6,56);
        double val = sum(l);
        System.out.println("\nInteger List: " + val);

        List<Number> f = List.of(0.1f, 0.3f, 0.5f, 0.6f, 2.3f, 4.5f);
        double val2 = sum(f);
        System.out.println("\nFloat List: " + val2);

        List<Person> p = List.of(new Person(), new Person(), new Person());
        double val3 = sum(p);
        System.out.println("\nFloat List: " + val3);

        // Count
        double val4 = countLargerThan(p, new Person());
        System.out.println("\nFloat List: " + val4);
    }
}
