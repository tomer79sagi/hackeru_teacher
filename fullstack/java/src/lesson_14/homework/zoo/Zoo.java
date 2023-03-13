package lesson_14.homework.zoo;

import lesson_14.homework.zoo.animal.Animal;
import lesson_14.homework.zoo.animal.Cat;
import lesson_14.homework.zoo.animal.Cow;
import lesson_14.homework.zoo.animal.Dog;
import java.util.Arrays;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("Apchi", "Long");
        Dog dog2 = new Dog("Chippy");
        Cat cat = new Cat("Mitsi");
        Cow cow = new Cow("Moomoo");
        Cow cow2 = new Cow("Moo Moo");

//        dog.name = "Tzupi";
        dog.setName("Tzupi");

        // Can create Arrays and ArrayList of type 'Asbtract' as it only indicates that it can hold subclasses of the abstract class
//        Animal[] arrAnimals = {};
//        Animal[] arrAnimals2 = new Animal[5];

        // A simple way of adding multiple items (sort of an array) to a list
//        ArrayList<Animal> animals = Arrays.toList(dog, dog2, cat, cow, cow2);

        // A standard way to add elements, one by one, to an ArrayList
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(dog2);
        animals.add(cat);
        animals.add(cow);
        animals.add(cow2);

        // First question
//        animals.forEach(a -> a.makeSound());

        // Second question
        animals.forEach(System.out::println);
        animals.forEach(Animal::makeSound);
        animals.
                stream().
                filter(a -> a instanceof Dog).
                forEach(System.out::println);
    }
}
