package lesson_20.generics;

import lesson_20.Person;

// This class / logic currently, can support ANY TYPE
public class BoxG<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public BoxG(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        BoxG<Integer> b = new BoxG(23);
        System.out.println(b.getT());

        BoxG<String> b2 = new BoxG("Tomer"); // WORKS NOW FINE!

        Person p = new Person("Tomer", 23);
        BoxG<Person> p2 = new BoxG(p);
    }
}
