package lesson_18;

public enum Color1 {
    RED,
    GREEN,
    BLUE;

    public static void main(String[] args) {
        System.out.println(Color1.RED);

        // 1. Using with a 'switch/case' statement
        System.out.println("\n> Switch statement");
        Color1 c1 = Color1.RED;

        switch (c1) {
            case RED -> System.out.println("This is a " + c1 + " color");
            case GREEN -> System.out.println("This is a " + c1 + " color");
            case BLUE -> System.out.println("This is a " + c1 + " color");
        }

        // 2. Using the 'values()' array
        System.out.println("\n> Print all values");
        for (Color1 c : Color1.values()) {
            System.out.println(c);
        }

        // 3. Using 'valueOf()'
        System.out.println("\n> Create Color object from value");
        Color1 c2 = Color1.valueOf("red".toUpperCase());
        System.out.println(c2);
    }
}


