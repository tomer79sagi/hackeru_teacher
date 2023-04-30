package lesson_23.bst;

import java.util.Objects;
import java.util.StringJoiner;

public class BST<T extends Comparable<T>> {
    private Node<T> root;

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(T value){
        var newNode = new Node<>(value);

        if (isEmpty()){
            root = newNode;
            return;
        }

        //call the recursive func
        insert(root, newNode);
    }

    private void insert(Node<T> root, Node<T> newNode) {
        if (newNode.value.compareTo(root.value) < 0) {
            if (root.left == null)
                root.left = newNode;
            else
                insert(root.left, newNode);
        } else {
            if (root.right == null)
                root.right = newNode;
            else
                insert(root.right, newNode);
        }
    }

    // PreOrder Traversal
    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node<T> root) {
        // 0. Check if root == null, return control if so
        if (root == null)
                return;

        // 1. Print the root first (preorder ==> root first, leaves second)
        System.out.println(root.value);

        // 2. Recursion left
        traversePreOrder(root.left);

        // 3. Recursion right
        traversePreOrder(root.right);
    }

//    public boolean search(T value){
//        if (root == null)return false; //empty tree?
//        return search(root, value);//not empty -> recursive method
//    }

    private class Node<T extends Comparable<T>>{
        private T value;
        private Node<T> right;
        private Node<T> left;
        //ctor:
        public Node(T value) {
            this.value = value;
        }
        //get/set value
        public T getValue() {
            return value;
        }
        public void setValue(T value) {
            this.value = value;
        }
        //get right, left
        public Node<T> getRight() {
            return right;
        }
        public Node<T> getLeft() {
            return left;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(value, node.value) && Objects.equals(right, node.right) && Objects.equals(left, node.left);
        }
        @Override
        public int hashCode() {
            return Objects.hash(value, right, left);
        }
        @Override
        public String toString() {
            return new StringJoiner(", ", Node.class.getSimpleName() + "[", "]")
                    .add("value=" + value)
                    .add("right=" + right)
                    .add("left=" + left)
                    .toString();
        }
    }
}
