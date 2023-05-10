package lesson_26.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SetB {
    public static void main(String[] args) {
        Collection<Integer> c1 = new ArrayList<>(List.of(1,2,3));
        List c2 = List.of(1,2);

        // Check if c1 contains c2
        System.out.println(c1.contains(c2)); // Checks if one element exists (List(1,2) element in list)
        System.out.println(c1.containsAll(c2)); // Check contents of two lists against each other
        System.out.println(c2.containsAll(c1)); // False

        c1.retainAll(c2); // Union
        System.out.println(c1);

        c1.addAll(c2); // Both, including duplicates
        System.out.println(c1);

        c1.removeAll(c2); // Remove all elements that exist in c2
        System.out.println(c1);
    }
}
