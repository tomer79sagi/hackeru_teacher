package lesson_23.hashtable;

public class Main {
    public static void main(String[] args) {

        System.out.println("tomer".hashCode());
        System.out.println("remot".hashCode());

        // Hashtable likely to be 1000 elements
        System.out.println("tomer".hashCode() % 10);
        System.out.println("remot".hashCode() % 10);
    }
}
