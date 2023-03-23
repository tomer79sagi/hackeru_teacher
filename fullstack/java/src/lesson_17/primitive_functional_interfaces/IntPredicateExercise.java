package lesson_17.primitive_functional_interfaces;

import java.util.ArrayList;
import java.util.function.IntPredicate;

public class IntPredicateExercise {
    public static void main(String[] args) {
        intPredicate();
    }

    private static void intPredicate() {
        IntPredicate isAgeEven = i -> i % 2 == 0;
        int[] arrNum = new int[5];

        for (int i = 0; i < 5; i++) {
            arrNum[i] = (int)Math.floor(Math.random() * 100 + 1);
            System.out.println(arrNum[i] + "\t" + isAgeEven.test(arrNum[i]));
        }
    }
}
