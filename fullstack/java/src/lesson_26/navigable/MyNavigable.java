package lesson_26.navigable;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class MyNavigable {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>(Set.of(5, 20, 1, 0, 2));

        System.out.println(set.headSet(5, true));//5 inclusive
        //[0, 1, 2, 5]

        System.out.println(set.higher(5));//20
        System.out.println(set.higher(1));//2
        System.out.println(set.lower(1));//0
        System.out.println(set.lower(0));//null

        //larger than value inclusive:
        System.out.println(set.ceiling(5));//5
        System.out.println(set.ceiling(6));//20
        System.out.println(set.ceiling(20));//20
        System.out.println(set.ceiling(21));//null

        //smaller than value inclusive:
        System.out.println(set.floor(5));//5
        System.out.println(set.floor(4));//2
        System.out.println(set.floor(-1));//null
    }
}
