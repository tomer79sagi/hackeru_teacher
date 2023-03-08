package lesson_13.abstract_shape;

public class Rectangle extends Shape {
    Rectangle() {

    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();

        rec.setColor("Blue");
        rec.getArea();
        System.out.println(rec.getColor());
        rec.print();

//        Shape shape = new Shape();
    }

    public double getArea() {
        return 15;
    }

    public double getPerimeter() {
        return 22;
    }

    public void print() {
        System.out.println("Printing Rectangle information...");
    }
}
