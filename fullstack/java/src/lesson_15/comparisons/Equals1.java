package lesson_15.comparisons;

import java.util.HashSet;
import java.util.Hashtable;

public class Equals1 {
    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
//        test4();
    }

    private static void test4() {
        Hashtable<Integer, Student> studentMap = new Hashtable<>();

        studentMap.put(444444, new Student(444444, "Tomer"));
        studentMap.put(77777, new Student(77777, "John"));
        studentMap.put(4545343, new Student(4545343, "Shimon"));
        studentMap.put(55555, new Student(342342, "Eitan"));
        studentMap.put(342342, new Student(342342, "XXXX"));

        for (Integer key: studentMap.keySet()) {
            System.out.println(key + "\t" + key.hashCode() + "\t" + studentMap.get(key).getName());
        }
    }

    // Testing Hash and the problem of duplicates in HashSet
    private static void test3() {
        // equals()
        Person tomer = new Person(4444, "Tomer");
        Person tomer2 = new Person(4444, "Sagi");

        System.out.println(tomer.equals(tomer2));

        // HashSet of String
        HashSet<String> hashS = new HashSet<>();
        hashS.add("Tomer");
        hashS.add("Tomer");

        System.out.println("Tomer".hashCode());
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
        System.out.println(tomer.hashCode());
        System.out.println(tomer2.hashCode());
        System.out.println(hash);
    }

    private static void test2() {
        // Check against 'null' value
        Person tomer = new Person(4444, "Tomer");
        Person john = tomer;
        Person tomer2 = null;
        String str = "Tomer";

        System.out.println(tomer.equals(john)); // true
        System.out.println(tomer.equals(tomer2)); // false
        System.out.println(tomer.equals(str)); // false
    }

    private static void test1() {
        Person tomer = new Person(4444, "Tomer");
        Person tomer2 = new Person(4444, "Tomer");
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
