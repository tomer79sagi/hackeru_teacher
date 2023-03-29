package lesson_18.enum_class;

public enum Color3Enum {
    RED("Red"),
    GREEN("Red"),
    BLUE("Red");

    private final String color;

    private Color3Enum(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}


