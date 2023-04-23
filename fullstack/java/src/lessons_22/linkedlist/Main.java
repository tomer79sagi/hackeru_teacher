package lessons_22.linkedlist;

public class Main {

    public static void main(String[] args) {
        // LinkedList is a list of elements connected to one another in a chain (without indexes)
        LinkedList<String> course = new LinkedList<String>();

        // Add courses that are dependant on one another
        course.add("Collections");
        course.add("List");
        course.add("Set");
        course.add("Hashtable");
        course.prepend("Inheritence");

        course.print();

        System.out.println(course.getSize());
    }
}
