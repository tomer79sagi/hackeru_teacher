package lesson_28.circle;

public class Circle {
    private double radius;//in cm
    //can't init using new from outside the class
    private Circle(double radius) {
        this.radius = radius;
    }
    //factory methods:

    public static Circle createCircleWithRadiusInCentimeters(double radius){
        return new Circle(radius);
    }
    /**
     *
     * @param radius in meters - will be converted to centimeters:
     * @return new Circle with radius in centimeters:
     */
    public static Circle createCircleWithRadiusInMeters(double radius){
        return new Circle(radius * 100);
    }
    /**
     *
     * @param radius in meters - will be converted to centimeters:
     * @return new Circle with radius in centimeters:
     */
    public static Circle createCircleWithRadiusInInches(double radius){
        return new Circle(radius * 2.54);
    }
}
