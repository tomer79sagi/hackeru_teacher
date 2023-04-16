package lesson_20.generics;

import lesson_20.Person;

// This class / logic currently, can support ANY TYPE
public class Box {

    private int t;

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public Box(int t) {
        this.t = t;
    }

    // Define a GENERIC method
    public <T> void print(T obj) {
        // T == <Integer> ...
        // Object == Object, casting...
        System.out.println(obj); // Invokes .toString()
        System.out.println(t); //
    }

    public <T> T print5thElement(T[] arr) {
        return arr[4];
    }

    public static void main(String[] args) {
        Box b = new Box(23);
        System.out.println(b.getT());

//        Box b2 = new Box("Tomer"); // Can't do it.

        Box b2 = new Box(44);
        b2.print("Tomer");
        b2.print(new Person("George", 44));

        String[] arr = {"A", "B", "C", "D", "E", "F"};
        String e = b2.print5thElement(arr);
        System.out.println(e.equalsIgnoreCase("e"));

        Integer[] arr2 = {4, 6, 8, 5, 8, 7};
        Integer e2 = b2.print5thElement(arr2);
        System.out.println(e2 + 79);

        Person[] arr3 = {new Person("A", 22), new Person("B", 44)};
        Person e3 = b2.print5thElement(arr3);
        System.out.println(e3);
    }
}
