package lesson_26.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetA {
    public static void main(String[] args) {
        //we are starting with a list:
        List<String> lst = List.of("one", "two", "three", "three", "three" ,"four", "five", "six");

        //we use Sets for its qualities:
        Set<String> set = new HashSet<>();
        set.addAll(lst);

        //[six, four, one, two, three, five]
        set.forEach(System.out::println);

        // Creates a copy of the HashSet, used when we want
        // to make sure a wrapper object doesn't return the pointer to the original HashSet object
        lst = List.copyOf(set);

        // Creates an ArrayList with a 'Collection' object (List or Set)
        lst = new ArrayList<>(set);
        System.out.println(lst);
        //[six, four, one, two, three, five]
        // (No duplicates) the order is dependent on the Set
    }
}
