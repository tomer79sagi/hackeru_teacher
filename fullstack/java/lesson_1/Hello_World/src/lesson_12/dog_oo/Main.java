package lesson_12.dog_oo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating multiple class instances using various hierarchy levels
        Bird bird = new Bird(LocalDate.now(), 2, "Tweetie");
        Dog dog = new Dog(LocalDate.now(), 4, "Apchi");
        Mammal mammal = new Mammal(LocalDate.now(), 4, "Mammal");

//        System.out.println(bird);
//        System.out.println(dog);
//
//        bird.feed("Grains");
//        dog.feed("Bonzo");
//        dog.bark();


        // Mixed ArrayList with multiple objects
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(bird);
        animals.add(dog);
        animals.add(mammal);

        // 1 - Iterating over base class + casting in separate line
        // Iterate over all 'Animal' instances (remember, Animal is base class and the rest are subclasses)
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                //Casting
                Dog d = (Dog)animal;
                System.out.println(d);
            }
        }

        // 2 - Iterating over base class + inline casting
//        for (Animal animal : animals) {
//            if (animal instanceof Dog d){
//                System.out.println(d);
//            }
//        }

        // 3 - Iterating over base class + late binding
//        for (Animal animal : animals) {
//            System.out.println(animal);
//        }
    }
}
