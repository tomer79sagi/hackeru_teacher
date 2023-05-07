package lesson_25.d_custom_exception;

public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new NegativeRadiusException();
//            throw new NegativeRadiusException("Can't take negative numbers");
        }
        this.radius = radius;
    }
}
