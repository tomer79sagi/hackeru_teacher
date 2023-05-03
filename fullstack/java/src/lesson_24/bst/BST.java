package lesson_24.bst;

import java.util.Objects;
import java.util.StringJoiner;

public class BST<T extends Comparable<T>>
        implements Iterable {
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

    private Node<T> findMaxNode() {
        if (isEmpty()) return null;
        return findMaxNode(root);
    }

    private Node<T> findMaxNode(Node<T> root) {
        if (root.right != null) {
            return findMaxNode(root.right);
        }

        return root;
    }

    public T max() {
        Node<T> max = findMaxNode();
        return max != null ? max.value : null;
    }

    public T min() {
        Node<T> min = findMinNode();
        return min == null ? null : min.value;
    }

    private Node<T> findMinNode() {
        if (root == null) return null;
        return findMinNode(root);
    }

    private Node<T> findMinNode(Node<T> root) {
        if (root.left != null) {
            return findMinNode(root.left);
        }
        return root;
    }


//    public boolean search(T value){
//        if (root == null)return false; //empty tree?
//        return search(root, value);//not empty -> recursive method
//    }

    private Node<T> inOrderSuccessor(Node<T> root, Node<T> current) {
        Node<T> successor = null;

        while (root != null) {
            if (current.value.compareTo(root.value) >= 0) {
                root = root.right;
            } else {
                successor = root;
                root = root.left; //root becomes null and we stop
            }
        }

        return successor;
    }

    // Method required by the 'Iterable' interface
    @Override
    public java.util.Iterator<T> iterator() {
        return new InOrderIterator();
    }
    private class InOrderIterator implements java.util.Iterator<T> {
        private Node<T> current;
        {
            current = findMinNode(root);
        }
        @Override
        public boolean hasNext() {
            return current != null;
        }
        @Override
        public T next() {
            if (current == null) return null;
            var returnValue = current.value;
            current = inOrderSuccessor(root, current);
            return returnValue;
        }
    }


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
