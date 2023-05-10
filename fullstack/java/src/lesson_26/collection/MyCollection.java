package lesson_26.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        for (int i = 0 ; i < 5 ; i++) {
            c.add(i);
        }

        System.out.println(c); // Print the entire Collection
        System.out.println(c.contains(4)); // Boolean, contains or doesn't contain
        System.out.println(c.contains(7)); // Boolean, contains or doesn't contain
    }
}
