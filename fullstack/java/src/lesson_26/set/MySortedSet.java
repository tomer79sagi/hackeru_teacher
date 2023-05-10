package lesson_26.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class MySortedSet {
    public static void main(String[] args) {
        SortedSet<Integer> numbers = new TreeSet<>();//Set.of(1, 20, 2)

        numbers.add(2);
        numbers.add(20);
        numbers.add(0);
        numbers.add(1);

        System.out.println(numbers.comparator());//null (we did not provide a Comparator)
        //Set uses Comparable<T> if we dont provide a comparator

        System.out.println(numbers.last());//20
        System.out.println(numbers.first());//0

        System.out.println(numbers.headSet(1));//[0]
        System.out.println(numbers.tailSet(1));//[1, 2, 20]

        System.out.println(numbers.subSet(1, 20));//[1, 2]
    }
}
