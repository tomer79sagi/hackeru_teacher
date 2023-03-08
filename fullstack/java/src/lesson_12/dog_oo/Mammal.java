package lesson_12.dog_oo;

import java.time.LocalDate;

public class Mammal extends Animal {
    public Mammal(LocalDate birthDate, int noOfLegs, String name) {
        super(birthDate, noOfLegs, name);
    }
}
