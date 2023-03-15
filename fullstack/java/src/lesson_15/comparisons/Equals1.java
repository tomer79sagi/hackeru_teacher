package lesson_15.comparisons;

import java.util.HashSet;

public class Equals1 {
    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }

    // Testing Hash
    private static void test3() {
        // equals()
        Person tomer = new Person("Tomer");
        Person tomer2 = new Person("Tomer");

        System.out.println(tomer.equals(tomer2));

        // HashSet of String
        HashSet<String> hashS = new HashSet<>();
        hashS.add("Tomer");
        hashS.add("Tomer");
        System.out.println(hashS);

        // HashSet of Integer
        HashSet<Integer> hashI = new HashSet<>();
        hashI.add(3);
        hashI.add(4);
        hashI.add(3);
        System.out.println(hashI);

        // HashSet of Person
        HashSet<Person> hash = new HashSet<>();
        hash.add(tomer);
        hash.add(tomer2);
        System.out.println(hash);
    }

    private static void test2() {
        // Check against 'null' value
        Person tomer = new Person("Tomer");
        Person john = tomer;
        Person tomer2 = null;
        String str = "Tomer";

        System.out.println(tomer.equals(john)); // true
        System.out.println(tomer.equals(tomer2)); // false
        System.out.println(tomer.equals(str)); // false
    }

    private static void test1() {
        Person tomer = new Person("Tomer");
        Person tomer2 = new Person("Tomer");
        Person john = tomer; // Assigns 'tomer's memory address to 'john'

//        System.out.println(tomer.getClass());

        // Because it's an custom defined object, it uses the default 'equals()' method, same memory address
        System.out.println("Person ref equals:\t" + tomer.equals(john)); // true
        System.out.println("Person obj equals:\t" + tomer.equals(tomer2)); // false

        String str1 = "Tomer";
        String str2 = "Tomer";

        // Because it's a String, it checks values
        System.out.println("String equals:\t" + str1.equals(str2)); // true
    }
}
