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
//        insert(root, newNode);
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
