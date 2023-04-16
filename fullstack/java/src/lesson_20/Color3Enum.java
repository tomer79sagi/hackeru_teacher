package lesson_20;

import java.util.Arrays;
import java.util.Optional;

public enum Color3Enum {
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue");

    private final String color;

    private Color3Enum(String color) {
        this.color = color;
        System.out.println("Constructor");
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

    // Using .stream() and .orElseThrow()
    // Benefits:
    // 1. Much less code
    // 2. Easier to read
    public static Color3Enum fromStringV2(String value) {
        return Arrays.stream(Color3Enum.values())
                .filter(c -> c.getColor().equalsIgnoreCase(value))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("This is illegal"));
    }

    // Finds a color or returns a default value
    public static Color3Enum fromStringV3(String value) {
        return Arrays.stream(Color3Enum.values())
                .filter(c -> c.getColor().equalsIgnoreCase(value))
                .findFirst().orElse(RED);
    }

    public static Optional<Color3Enum> fromStringV4(String value) {
        return Arrays.stream(Color3Enum.values())
                .filter(c -> c.getColor().equalsIgnoreCase(value))
                .findFirst();
    }
}


