package lesson_11.dog_oo;

import java.time.LocalDate;

public class Animal {
    LocalDate birthDate;
    int noOfLegs;
    String name;

    public Animal(LocalDate birthDate, int noOfLegs, String name) {
        this.birthDate = birthDate;
        this.noOfLegs = noOfLegs;
        this.name = name;
    }

    public void feed(String food) {
        System.out.println("Feeding with " + food);
    }

    public String toString() {
        return name + " ; " + noOfLegs + " legs ; " + birthDate;
    }
}
