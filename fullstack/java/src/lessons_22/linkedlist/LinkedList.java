package lessons_22.linkedlist;

public class LinkedList<T> {
    private Node<T> head; // First
    private Node<T> last;
    private int size = 0;

    private boolean isEmpty() {
        return head == null;
    }

    // Method to add an element to the start of the chain
    public void prepend(T value) {
        Node<T> n = new Node(value);

        if (isEmpty())
            head = last = n; // Logic already exists. Need to find a solution for re-use
        else {
            // Change 'head' to be second temporarily and 'n' to be first
            n.next = head;

            // Set 'head' to point o 'n' (the first element)
            head = n;
        }

        size++;
    }

    public void add(T value) {
        Node<T> n = new Node(value);

        if (isEmpty())
            head = last = n;
        else {
            // Attach the new one after the last one
            last.next = n;

            // Change the 'last' object to point to the 'new' last object
            last = n;
        }

        size++;
    }

    @Override
    public String toString() {
        String s = "";

        Node<T> cNode = head;
        while (cNode != null) {
            s += " : " + cNode.toString();
            cNode = cNode.next;
        }

        return s;
    }

    public void print() {
        System.out.println("[" + head.value.getClass().getSimpleName() + "]" + toString());
    }

    public int getSize() {
        return size;
    }

    // Node<T> is ONLY used by the LinkedList class to manage the data structure
    // CANNOT be accessed from the outside
    private static class Node<T> {
        //fields:
        T value;
        Node<T> next;
        //constructors:
        public Node(T value) {
            this(value, null);
        }
        private Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        public String toString() {
            return value.toString();
        }
    }
}
