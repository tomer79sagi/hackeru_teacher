package lesson_18;

public enum Color2 {
    RED("Red"),
    GREEN("Red"),
    BLUE("Red");

    private final String color;

    private Color2(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        System.out.println(Color2
                .RED);

        // 1. Using with a 'switch/case' statement
        System.out.println("\n> Switch statement");
        Color2 c1 = Color2.RED;

        switch (c1) {
            case RED -> System.out.println("This is a " + c1 + " color");
            case GREEN -> System.out.println("This is a " + c1 + " color");
            case BLUE -> System.out.println("This is a " + c1 + " color");
        }

        // 2. Using the 'values()' array
        System.out.println("\n> Print all values");
        for (Color2 c : Color2.values()) {
            System.out.println(c);
        }

        // 3. Using 'valueOf()'
        System.out.println("\n> Create Color object from value");
        Color2 c2 = Color2.valueOf("red".toUpperCase());
        System.out.println(c2);
    }

    public String getColor() {
        return color;
    }
}


