package lesson_26.to_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MyToArray {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>(List.of(1,2,3,4,5,6));

        // Send a new Array of the relevant type
        // IMPORTANT: Must have the same size as the Collection size, otherwise we get an exception
        Integer[] arrI1 = c.toArray(new Integer[c.size()]); // (1) new with collection.size();
        Integer[] arrI2 = c.toArray(Integer[]::new); // (2) Constructor reference, similar to method reference

//        Arrays.stream(arrI2).forEach(System.out::println);
        Arrays.stream(arrI2).forEach(e -> System.out.println(e + "..."));
//        System.out.println(Arrays.toString(arrI2)); // Default
    }
}
