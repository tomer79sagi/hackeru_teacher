package lesson_19.enum_class;

import java.time.DayOfWeek;
import java.util.Arrays;

public class Main {

    public final static int[] green = {155, 222, 15};
    public final static int[] red = {55, 222, 15};
    public final static int[] blue = {0, 100, 15};

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
    }

    // Using Status.enum
    private static void test4() {
        System.out.println(Status.Name.CREATED);

        Status status = new Status();
    }

    private static void test3() {
        for (DayOfWeek dw : DayOfWeek.values()) {
            System.out.println(dw);
        }
    }

    private static void test2() {
        System.out.println(Color.RED);
        System.out.println(Color.BLUE);
        System.out.println(Color.GREEN);

        System.out.println("Iterate over Enum");

        // New concepts: ***
        // 1. Arrays.stream(Array[]) -> Creates 'stream()' from Array
        // 2. {enum}.values() -> Returns an Array of the enum attributes.
        Color[] colorArr = Color.values();

        Arrays.stream(colorArr).forEach(c -> System.out.println(c));
//        for (Color c : colorArr) {
//            System.out.println(c);
//        }
    }

    private static void test1() {
        String color = "green"; // Green
        int[] color1 = {155, 222, 15}; // Green

        System.out.println(green);
        System.out.println(blue);
        System.out.println(red);
    }
}
