package lesson_19.optional;

public class Optional1 {
    public static void main(String[] args) {
        String name = searchName(1); // Name has value
        String nameNull = searchName(2); // Name has 'null' value

        System.out.println(name);

        if (nameNull != null) {
            System.out.println(name);
        } else {
            System.out.println("Didn't find the right value");
        }
    }

    private static String searchName(int num) {
        if (num == 1) {
            return "Tomer";
        } else {
            return null;
        }
    }
}
