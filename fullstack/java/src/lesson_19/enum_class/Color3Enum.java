package lesson_19.enum_class;

public enum Color3Enum {
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue");

    private final String color;

    private Color3Enum(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return color;
    }

    // Implement a better 'valueOf()' implementation based on string
    public static Color3Enum fromStringV1(String value) {
        for (Color3Enum c : values()) {
            if (c.getColor().equalsIgnoreCase(value)) {
                return c;
            }
        }

        // If the above fails
        throw new IllegalArgumentException("Must include a valid color name");
    }
}


