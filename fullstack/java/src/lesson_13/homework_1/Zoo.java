package lesson_13.homework_1;

public class Zoo {
    public static <ArrayList> void main(String[] args) {
        Dog dog = new Dog("Apchi", "Long");
        Dog dog2 = new Dog("");
        Cat cat = new Cat("Mitsi");
        Cow cow = new Cow("Moomoo");
        Animal animal = new Animal("Animal");

        Person person = new Person();

//        dog.name = "Tzupi";
        dog.setName("Tz");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(cow);

        person.print();
        dog.print();

        person.sort();
        dog.sort();

//        ArrayList printables = new ArrayList<>();
//        printables.add(dog);
//        printables.add(person);

    }
}
