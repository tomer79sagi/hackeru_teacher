package lesson_5;

public class Methods {
    public static void main(String[] args) {
        int num = sum(5, 6);

        System.out.println(num);
        printName("Tomer"); // Method doesn't return any value (has a 'void' return value)
    }

    static int sum(int x, int y) {
        return x + y;
    }

    static void printName(String name) {
        System.out.println(name);
    }

    static String getName() {
        return "Tomer Sagi";
    }
}
