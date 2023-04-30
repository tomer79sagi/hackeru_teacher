package lesson_23.bst;

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
        bst.traversePreOrder();
    }
}
