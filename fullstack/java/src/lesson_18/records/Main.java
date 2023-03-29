package lesson_18.records;

public class Main {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    private static void test2() {
//        Student s = new Student("Tomer", "Sagi");
//        Student s2 = new Student("John", "Smith");

        StudentCompactConstructor s3 = new StudentCompactConstructor("Tomer", "Sagi");
        StudentCompactConstructor s4 = new StudentCompactConstructor("Jeff", "Smith");

        System.out.println(s3);
        System.out.println(s4);
    }

    private static void test1() {
        Student s = new Student("Tomer", "Sagi");
        Student s2 = new Student("John", "Smith");

        // Automatically implemented:
        // 1. hashCode()
        System.out.println(s.hashCode());

        // 2. equals()
        System.out.println(s.equals(s2));

        // 3. getter method - 'name()'
        System.out.println(s.firstName());

        // 4. toString() implementation
        System.out.println(s);
    }
}
