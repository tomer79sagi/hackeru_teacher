package lesson_12.oo.object_oriented;

import java.time.LocalDate;

//all methods and all properties of a vehicle
public class Motorcycle extends Vehicle {
    //extra props:
    String handlebars;
    //constructor: all vehicle properties + handlebars

    public Motorcycle(String model) {
        this(model, "Pink with butterflies");
    }

    public Motorcycle(String model, String handlebars) {
        // Use the 'parent' constructor with the 'model' attribute
        super(model);

        // Override default color for motorcycles to 'Green'
        this.color = "Green";

        // Save the 'handlebars' to the local object (will NOT appear in the parent)
        this.handlebars = handlebars;
    }

    public Motorcycle(String model, long kilometers, String color, LocalDate manufactureDate, String handlebars) {
        super(model, kilometers, color, manufactureDate);//first line
        this.handlebars = handlebars;
    }

    @Override
    public String toString() {
        return this.getClass() +
                " {handlebars='" + handlebars + '\'' +
                ", manufactureDate=" + manufactureDate +
                ", model='" + model + '\'' +
                ", kilometers=" + kilometers +
                ", color='" + color + '\'' +
                '}';
    }
}
