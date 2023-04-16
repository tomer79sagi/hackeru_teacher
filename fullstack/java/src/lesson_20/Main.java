package lesson_20;

enum Enums {
    A, B, C;

    private int age;

    public static int day;
    //class initializer
    {
        age = 23;
        System.out.println(this);
    }
    //static initilizer
    static {
        day = 24;
        System.out.println("Dave");
    }
    private Enums() {
        System.out.println(1);
    }
}
public class Main {
    public static void main(String[] args) {
        Enum en = Enums.B;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}