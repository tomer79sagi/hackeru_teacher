package lesson_28.circle;

public class Main {
    public static void main(String[] args) {
        // Factory method/builder
        Circle c1 = Circle.createCircleWithRadiusInCentimeters(187);
        Circle c2 = Circle.createCircleWithRadiusInMeters(1.87);
        Circle c3 = Circle.createCircleWithRadiusInInches(0.87);
    }
}
