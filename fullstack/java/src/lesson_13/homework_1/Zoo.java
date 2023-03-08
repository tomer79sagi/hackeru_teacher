package lesson_13.homework_1;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("Apchi", "Long");
        Dog dog2 = new Dog("");
        Cat cat = new Cat("Mitsi");
        Cow cow = new Cow("Moomoo");
        Animal animal = new Animal("Animal");

//        dog.name = "Tzupi";
        dog.setName("Tz");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(cow);
    }
}
