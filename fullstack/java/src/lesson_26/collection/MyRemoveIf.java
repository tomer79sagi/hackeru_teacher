package lesson_26.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class MyRemoveIf {
    public static void main(String[] args) {
        // Collection --> Collection interface (extends Iterable, subclasses = List,Set,Queue)
        // Collections --> Utility class, has utility methods, such as sort()

        // Object --> Base class of ALL classes in Java
        // Objects --> Utility class, has utility methods, such as .isNull()

//        System.out.println("".isEmpty()); // true
//        System.out.println("    ".isEmpty()); // false
//        System.out.println("".isBlank()); // true
//        System.out.println("    ".isBlank()); // true

        Predicate<String> isNull = Objects::isNull; // ==> boolean Objects.isNull(obj)
        Predicate<String> isEmpty = String::isEmpty; // ==> boolean String.isEmpty(str_obj)
        Predicate<String> isNullOrEmpty = isNull.or(isEmpty);
        Predicate<String> isBlank = String::isBlank; // ==> boolean String.isBlank(str_obj)

        Collection<String> c = new ArrayList<>(List.of("One", "Two", "Three"));
        c.add(null);
        c.add(null);
        c.addAll(List.of("", " "));
        System.out.println(c); // ==> [One, Two, Three, null, null, ,  ]
        c.removeIf(isNullOrEmpty);
        System.out.println(c); // ==> [One, Two, Three,  ]
        c.removeIf(isNullOrEmpty.or(isBlank));
        System.out.println(c); // ==> [One, Two, Three]
    }
}
