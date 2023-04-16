package lesson_20;

import java.util.HashSet;
import java.util.Hashtable;

public record Person(String name, int age) {

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;

        System.out.println("hashCode: " + result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("\nHashSet implementation");
        HashSet<Person> hS = new HashSet<>();
        hS.add(new Person("Tomer Sagi", 44));
        hS.add(new Person("Shimon", 33));
        hS.add(new Person("Eitan", 33));

        // Add implementation with HashMap<>();
        System.out.println("\nHashtable implementation");
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("Sunday", "Sandwich");
        ht.put("Monday", "Soup");
        ht.put("Tuesday", "Meatballs");

        // Let's print the hashCodes of all elements (the indexes)
        ht.forEach((k, v) -> System.out.println(k.hashCode() + " : " + v));
    }
}
