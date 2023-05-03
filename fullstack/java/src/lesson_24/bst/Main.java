package lesson_24.bst;

import lesson_24.Hashtable;

import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();

        bst.insert(28);
        bst.insert(19);
        bst.insert(16);
        bst.insert(45);
        bst.insert(41);
        bst.insert(61);
        bst.insert(42);
        bst.insert(57);
        bst.insert(77);
        bst.insert(58);

//        System.out.println(bst);
//        bst.traversePreOrder();
//        System.out.println(bst.max());

        HashMap<Integer, String> ht = new HashMap<>();
        ht.put(123, "Tomer");
        ht.put(444, "John");

        Iterator<Integer> bs = bst.iterator();
        Iterator<String> iHT = ht.values().iterator();

        while (bs.hasNext()) {
            Integer s = bs.next();
            System.out.println(s);
        }

        while (iHT.hasNext()) {
            String s = iHT.next();
            System.out.println(s);
        }
    }
}
