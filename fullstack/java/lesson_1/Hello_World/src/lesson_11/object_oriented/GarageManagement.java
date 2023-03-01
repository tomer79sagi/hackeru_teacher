package lesson_11.object_oriented;

import java.time.LocalDate;

public class GarageManagement {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle("Subaru");
        Vehicle car2 = new Vehicle("Honda", 55, "Black");
        Vehicle car3 = new Vehicle("Chevrolette", 23, "Blue", LocalDate.now());

        Motorcycle motorcycle1 = new Motorcycle("Kawasaki"); // Uses 'super'
        SportsMotorcycle motorcycle2 = new SportsMotorcycle("Hyundai");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(motorcycle1);
        System.out.println(motorcycle2);

    }
}
