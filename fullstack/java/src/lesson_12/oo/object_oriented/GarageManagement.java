package lesson_12.oo.object_oriented;

import java.time.LocalDate;
import java.util.ArrayList;

public class GarageManagement {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle("Subaru");
        Vehicle car2 = new Vehicle("Honda", 55, "Black");
        Vehicle car3 = new Vehicle("Chevrolette", 23, "Blue", LocalDate.now());

        Motorcycle motorcycle1 = new Motorcycle("Kawasaki"); // Uses 'super'
        SportsMotorcycle motorcycle2 = new SportsMotorcycle("Hyundai");

        car1.drive(5);
        car2.steer(60);
        car3.steer(-50);
        car3.stop();

        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(car3);
        vehicles.add(motorcycle1);
        vehicles.add(motorcycle2);

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

//        System.out.println(car1);
//        System.out.println(car2);
//        System.out.println(car3);
//        System.out.println(motorcycle1);
//        System.out.println(motorcycle2);

    }
}
