package lesson_11.dog_oo;

import java.time.LocalDate;

public class Dog extends Mammal {
    public Dog(LocalDate birthDate, int noOfLegs, String name) {
        super(birthDate, noOfLegs, name);
        System.out.println("Dog constructor");
    }

    public void bark() {
        System.out.println(name + " is barking");
    }
}
