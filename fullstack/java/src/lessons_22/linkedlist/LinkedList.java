package lessons_22.linkedlist;

public class LinkedList<T> {
    private Node<T> head; // First
    private Node<T> last;

    private boolean isEmpty() {
        return head != null;
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
        @Override
        public String toString() {
            return new StringJoiner(", ", Node.class.getSimpleName() + "[", "]")
                    .add("value=" + value)
                    .add("next=" + next)
                    .toString();
        }
    }
}
