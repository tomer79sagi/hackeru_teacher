package lesson_27.collections_methods;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static <T> Set<T> symmetricDifference(Set<T> a, Set<T> b){
        var intersection = new HashSet<>(a);
        intersection.retainAll(b);//intersection
        var symmetricDifference = new HashSet<>(a);
        symmetricDifference.addAll(b); //union:

        //union remove intersection
        symmetricDifference.removeAll(intersection);
        return symmetricDifference;
    }

    public static <T> Set<T> intersection(Set<T> a, Set<T> b){
        var copy = new HashSet<>(a);
        copy.retainAll(b);
        return copy;
    }
    public static <T> Set<T> union(Set<T> a, Set<T> b){
        var union = new HashSet<>(a);
        union.addAll(b);
        return union;
    }
    public static <T> Set<T> difference(Set<T> a, Set<T> b){
        //return a.size() < b.size() ?
        var difference = new HashSet<>(a);
        difference.removeAll(b);
        return difference;
    }
}
