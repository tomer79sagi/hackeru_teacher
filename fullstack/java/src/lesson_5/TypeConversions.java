package lesson_5;

import java.util.Arrays;

public class TypeConversions {
    public static void main(String[] args) {
        int age = Integer.parseInt("36");
        String year = String.valueOf(1979);

        int[] ages = {33,46,23, 12, 51};
        String arrNames = Arrays.toString(ages);

        System.out.printf("%d, %s, %s, %s", age, year, ages, arrNames);
    }
}
