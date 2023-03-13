package lesson_14.interfaces.zoo;

import lesson_14.interfaces.zoo.animal.Animal;
import lesson_14.interfaces.zoo.animal.Cat;
import lesson_14.interfaces.zoo.animal.Cow;
import lesson_14.interfaces.zoo.animal.Dog;
import lesson_14.interfaces.zoo.facility.Cage;
import lesson_14.interfaces.zoo.person.Person;
import lesson_14.interfaces.zoo.report.IOutput;
import lesson_14.interfaces.zoo.report.IReport;
import lesson_14.interfaces.zoo.report.Printable;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("Apchi", "Long");
        Dog dog2 = new Dog("Chippy");
        Cat cat = new Cat("Mitsi");
        Cow cow = new Cow("Moomoo");

        dog.setName("Tzupi");

        Person person = new Person();
        Cage cage = new Cage();

        // Down-casting
        Animal a = new Dog("John");
        Dog d = (Dog)a;

        d.getFurType();


        printable(dog, dog2, cat, cow, person, cage);
        outputable(dog, dog2, cat, cow, cage);
    }

    private static void outputable(Dog dog, Dog dog2, Cat cat, Cow cow, Cage cage) {
        // Creating a list of 'IOutput' implementations (both 'print()' and 'report()'
        ArrayList<IOutput> outputable = new ArrayList<>();
        outputable.add(dog);
        outputable.add(dog2);
        outputable.add(cat);
        outputable.add(cow);
        outputable.add(cage);

        // As a developer that is responsible for ONLY printing, I don't need or WANT to know about the details
        // of a 'Person' class or 'Animal' class

        outputable.forEach(p -> {
            p.print();
            p.sendFax();
            p.report();
        });
    }

    private static void printable(Dog dog, Dog dog2, Cat cat, Cow cow, Person person, Cage cage) {
        // Creating a list of 'Printable' implementations
        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(dog);
        printables.add(dog2);
        printables.add(cat);
        printables.add(cow);
        printables.add(person);
        printables.add(cage);

        // As a developer that is responsible for ONLY printing, I don't need or WANT to know about the details
        // of a 'Person' class or 'Animal' class
        System.out.println(Printable.PRINTER_NAME); // Can use a 'final' attribute
        System.out.println(IReport.prepareReport());

        printables.forEach(p -> {
            p.print();
            p.sendFax();
        });
    }
}
