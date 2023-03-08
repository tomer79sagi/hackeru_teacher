package lesson_10;

import java.util.ArrayList;

public class LambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        // Option 1
        numbers.forEach( n -> System.out.println(n) );

        // Option 2 (can support multiple values as parameters)
        numbers.forEach( (n) -> System.out.println(n) );
//        numbers.forEach( (n, m) -> System.out.println(n) + " ; " + System.out.println(m));

        // Option 3 (can support multiple lines of code, a block of code)
        numbers.forEach( (n) -> {
            System.out.println(n);
        } );

        // The same as
//        for (Integer myInt : numbers) {
//            System.out.println(myInt);
//        }
    }
}
