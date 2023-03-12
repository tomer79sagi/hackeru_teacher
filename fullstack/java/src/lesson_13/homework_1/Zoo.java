package lesson_13.homework_1;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("Apchi", "Long");
        Dog dog2 = new Dog("Chippy");
        Cat cat = new Cat("Mitsi");
        Cow cow = new Cow("Moomoo");
        Animal animal = new Animal("Animal");

        Person person = new Person();

//        dog.name = "Tzupi";
        dog.setName("Tzupi");

        person.print();
        dog.print();

        person.sort();
        dog.sort();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(dog2);
        animals.add(cat);
        animals.add(cow);

        animals.
                stream().
                filter(a -> a instanceof Cat).
                forEach(a -> System.out.println(a));
    }
}
