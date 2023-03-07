package lesson_11.dog_oo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird(LocalDate.now(), 2, "Tweetie");
        Dog dog = new Dog(LocalDate.now(), 4, "Apchi");

        System.out.println(bird);
        System.out.println(dog);

        bird.feed("Grains");
        dog.feed("Bonzo");
        dog.bark();
    }
}
