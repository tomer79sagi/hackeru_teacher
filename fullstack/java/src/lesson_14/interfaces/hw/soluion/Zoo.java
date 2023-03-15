package lesson_14.interfaces.hw.soluion;

import lesson_14.interfaces.hw.soluion.animal.Cat;
import lesson_14.interfaces.hw.soluion.animal.Cow;
import lesson_14.interfaces.hw.soluion.db.IDB;
import lesson_14.interfaces.hw.soluion.facility.Cage;
import lesson_14.interfaces.hw.soluion.person.Person;
import lesson_14.interfaces.hw.soluion.report.IOutput;
import lesson_14.interfaces.hw.soluion.report.IReport;
import lesson_14.interfaces.hw.soluion.report.Printable;
import lesson_14.interfaces.hw.soluion.animal.Dog;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        // ---- Lesson 14
        interfacesHW();


//        Dog dog = new Dog("Apchi", "Long");
//        Dog dog2 = new Dog("Chippy");
//        Cat cat = new Cat("Mitsi");
//        Cow cow = new Cow("Moomoo");
//
//        dog.setName("Tzupi");
//
//        Person person = new Person("Herald");
//
//
//        // ---- Lesson 13
//        Cage cage = new Cage();
//
//        // Down-casting
//        Animal a = new Dog("John");
//        Dog d = (Dog)a;
//
//        d.getFurType();
//
//        printable(dog, dog2, cat, cow, person, cage);
//        outputable(dog, dog2, cat, cow, cage);
    }

    private static void interfacesHW() {
        // ---- Lesson 14 : Homework
        // 1. Create ArrayList of IDB types
        ArrayList<IDB> arr = new ArrayList<IDB>();
        arr.add(new Person("Mike"));
        arr.add(new Dog("Apchi"));
        arr.add(new Cat("Mitzi"));
        arr.add(new Cow("Moomoo"));

        // 2. Perform the following functions
        //  - Print DB name
        System.out.println(IDB.serverName);

        //  - Connect
        IDB.connect();

        //  - Create new Dog and save it
        Dog chip = new Dog("Chippy");
        boolean saveResult = chip.save();
        System.out.println("Saving status: " + saveResult);

        //  - Delete a dog
        boolean deleteResult = chip.delete();
        System.out.println("Deleting status: " + deleteResult);

        //  - Delete the 2nd element from the ArrayList
        boolean deleteResult2 = arr.get(1).delete();
        System.out.println("Deleting status: " + deleteResult2);

        //  - Search (use implementation) by dog name
        boolean result = arr.get(0).update("Update name to 'Bonzo'");
        if (result)
            System.out.println("Successfully updated DB");
        else
            System.out.println("Failed updating DB");

        //  - Disconnect
        IDB.disconnect();
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
