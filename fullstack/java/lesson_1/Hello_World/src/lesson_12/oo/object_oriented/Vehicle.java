package lesson_12.oo.object_oriented;

import java.time.LocalDate;

public class Vehicle {
    //props:
    LocalDate manufactureDate;
    String model;
    long kilometers;
    String color;

    //convenience constructor
    public Vehicle(String model, long kilometers, String color) {
        this(model, kilometers, color, LocalDate.now());
    }

    //convenience constructor, based on requirements
    public Vehicle(String model) {
        this(model, 0, "White", LocalDate.now());
        System.out.println(model);
    }

    //Designated constructor:
    public Vehicle(String model, long kilometers, String color, LocalDate manufactureDate) {
        this.model = model;
        this.kilometers = kilometers;
        this.color = color;
        this.manufactureDate = manufactureDate;
    }
    //methods:
    public String toString() {
        return this.getClass() +
                " {manufactureDate=" + manufactureDate +
                ", model='" + model + '\'' +
                ", kilometers=" + convertKMtoMiles() +
                ", color='" + color + '\'' +
                '}';
    }
    void drive(int km){
        System.out.printf("%s Driving %d\n",model, km);
        this.kilometers += km;
    }
    protected void stop(){
        System.out.printf("%s Stopping\n", model);
    }
    protected void steer(int degrees) {
        System.out.printf((degrees > 0 ? "Turning right by %d" : "Turning Left by %d"), degrees);
    }

    private int convertKMtoMiles() {
        return (int)(kilometers * 1.6);
    }
}
