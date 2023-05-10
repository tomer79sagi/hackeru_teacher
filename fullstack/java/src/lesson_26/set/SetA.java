package lesson_26.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetA {
    public static void main(String[] args) {
        //we are starting with a list:
        var lst = List.of("one", "two", "three", "three", "three" ,"four", "five", "six");

        //we use Sets for its qualities:
        Set<String> set = new HashSet<>();
        set.addAll(lst);

        //[six, four, one, two, three, five]
        set.forEach(System.out::println);

        //done with the exercise, we need a list back:
        lst = List.copyOf(set);
        lst = new ArrayList<>(set);
        System.out.println(lst);
        //[six, four, one, two, three, five]
        // (No duplicates) the order is dependent on the Set
    }
}
