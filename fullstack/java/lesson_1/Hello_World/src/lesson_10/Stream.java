package lesson_10;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        // Create a new list of all numbers higher than 5
        List numbersHigherFive = numbers.stream().filter(n -> n > 5).toList();
//        List numbersHigherFive = numbers.stream().filter(n -> n > 5).collect(Collectors.toList());

        // Option 1
        numbersHigherFive.forEach( n -> System.out.println(n) );
    }
}
