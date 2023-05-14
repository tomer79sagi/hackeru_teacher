package lesson_27.list_interface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class MyList {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(List.of("Tomer", "Sagi", "John", "Michael", "Jeff"));
        List<String> lsub = l.subList(1, 3);

        System.out.println(lsub);
//        lsub.clear();
//        System.out.println(lsub);

        List<String> lnew = List.copyOf(l); // Creates an immutable List object
        List<String> lnew2 = new ArrayList<>(l); // Creates a mutable list object
        lnew2.sort(Comparator.naturalOrder());
        System.out.println(lnew2);

        // Standard Iterator has only 'hasNext()' and 'next()'
        // ListIterator is an advanced Iterator:
        // - Has also hasPrevious(), previous(), previousIndex(), nextIndex()
        // - Can provide a starting index, so 'hasPrevious()' would work as well
        ListIterator<String> li = lnew2.listIterator(1);
//        while (li.hasNext()) {
//            System.out.println(li.previousIndex() + " | " + li.next() + " | " + li.nextIndex());
//        }

        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
