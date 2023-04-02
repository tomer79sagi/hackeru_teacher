package lesson_19.enum_class;

import java.util.Arrays;

public class Main {

    public final static int[] green = {155, 222, 15};
    public final static int[] red = {55, 222, 15};
    public final static int[] blue = {0, 100, 15};

    public static void main(String[] args) {
//        test1();
        test2();
    }

    private static void test2() {
        System.out.println(Color.RED);
        System.out.println(Color.BLUE);
        System.out.println(Color.GREEN);

        // Arrays.stream(Array[]) -> Creates 'stream()' from Array
        Arrays.stream(Color.values()).
                forEach(c -> System.out.println(c));
    }

    private static void test1() {
        String color = "green"; // Green
        int[] color1 = {155, 222, 15}; // Green

        System.out.println(green);
        System.out.println(blue);
        System.out.println(red);
    }
}
