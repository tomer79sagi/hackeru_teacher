package lesson_19.enum_class;

public class Color3Main {

    public static void main(String[] args) {
        System.out.println(Color3Enum.RED);

        // 1. Using with a 'switch/case' statement
        System.out.println("\n> Switch statement");
        Color3Enum c1 = Color3Enum.RED;

        switch (c1) {
            case RED -> System.out.println("This is a " + c1 + " color");
            case GREEN -> System.out.println("This is a " + c1 + " color");
            case BLUE -> System.out.println("This is a " + c1 + " color");
        }

        // 2. Using the 'values()' array
        System.out.println("\n> Print all values");
        for (Color3Enum c : Color3Enum.values()) {
            System.out.println(c);
        }

        // 3. Using 'valueOf()'
        System.out.println("\n> Create Color object from value");
        Color3Enum c2 = Color3Enum.valueOf("RED"); // Searches all enum constants for a constant named "RED"
        System.out.println(c2);

        // 4. Implement our own search function for the Enum class, it will be static
        // so we can access it without initializing the Enum class -> utility method
        System.out.println("\n> Search the Enum using our own method");
        Color3Enum c3 = Color3Enum.fromStringV1("Red");
        System.out.println(c3);
    }
}


