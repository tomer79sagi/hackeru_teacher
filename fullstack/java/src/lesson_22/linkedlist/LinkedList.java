package lesson_22.linkedlist;

public class LinkedList<T> {
    private Node<T> head; // First
    private Node<T> last;
    private int size = 0;

    private boolean isEmpty() {
        return head == null;
    }
    
    // 'Builder' design pattern
    // 1. Create new Node, list is empty, set head & last, return indicator that no further action is required (return null)
    // 2. Create new Node, list is NOT empty, return the Node
    private Node<T> createNode(T value) {
        Node<T> n = new Node<>(value);

        if (isEmpty()) {
            head = last = n; // Logic already exists. Need to find a solution for re-use
            return null;
        }

        return n;
    }

    // Method to add an element to the start of the chain
    public void prepend(T value) {
        Node<T> n = createNode(value);

        if (n != null) {
            // Change 'head' to be second temporarily and 'n' to be first
            n.next = head;

            // Set 'head' to point o 'n' (the first element)
            head = n;
        }

        size++;
    }

    // Example: LinkedList with 3 elements, index = 2
    public void add(int index, T value) {
        // 1. Check for exceptions
        if (index > size || index < 1)
            throw new ArrayIndexOutOfBoundsException();

        // Index is valid
        // 2. Trying to add at the start, use 'prepend()'
        if (index == 1) {
            prepend(value);
            return;
        // 3. Trying to add as the last element, use 'add()'
        } else if (index == size) {
            add(value);
            return;
        }

        // 4. Add somewhere in the middle of the LinkedList
        Node<T> n = createNode(value);
        if (n != null) {
            Node<T> cNode = head;
            for (int i = 1; i < index - 1 ; i++) {
                cNode = cNode.next;
            }

            // cNode = Node at the index to be replaced
            // the 'next' of the new Node => next of the one before the 'index'
            n.next = cNode.next;

            // The 'next' of the one before the index => new Node
            cNode.next = n;
        }

        size++;
    }

    public void add(T value) {
        Node<T> n = createNode(value);

        if (n != null) {
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
            s += " : " + cNode;
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

    public T[] toArray() {

        return null;
    }

    public LinkedList<T> reverse() {
        // 1. Create LinkedList<T> to hold the new reversed list

        // 2. Convert LinkedList to Array
        // - Create array of size .getSize()
        // - 'while' loop over .next() objects that are not null
        // - Add each element to array

        // 3. Iterate over array from last to first
        // - Add nodes to the new LinkedList

        // 4. Return new linkedlist
        return null;
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
