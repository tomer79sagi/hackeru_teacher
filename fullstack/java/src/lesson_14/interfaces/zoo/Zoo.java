package lesson_14.interfaces.zoo;

import lesson_14.interfaces.zoo.animal.Animal;
import lesson_14.interfaces.zoo.animal.Cat;
import lesson_14.interfaces.zoo.animal.Cow;
import lesson_14.interfaces.zoo.animal.Dog;
import lesson_14.interfaces.zoo.person.Person;
import lesson_14.interfaces.zoo.report.IReport;
import lesson_14.interfaces.zoo.report.Printable;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("Apchi", "Long");
        Dog dog2 = new Dog("Chippy");
        Cat cat = new Cat("Mitsi");
        Cow cow = new Cow("Moomoo");

        Person person = new Person();

        dog.setName("Tzupi");

        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(dog);
        printables.add(dog2);
        printables.add(cat);
        printables.add(cow);
        printables.add(person);

        // As a developer that is responsbile for ONLY printing, I don't need or WANT to know about the details
        // of a 'Person' class or 'Animal' class
        printables.forEach(p -> p.print());
    }
}
