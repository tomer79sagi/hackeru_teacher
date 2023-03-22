package lesson_17.primitive_functional_interfaces;

public class AutoBoxing {
    public static void main(String[] args) {
        int age = Integer.valueOf(4); // Converting primitive to Integer is done automatically during compilation --> Autounboxing
        Integer num = 55; // During compilation, it's converted to Integer --> Autoboxing

        System.out.println(num + 77);
     }
}
