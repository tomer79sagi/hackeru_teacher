package lesson_12.dog_oo.homework_1;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("Apchi", "Long");
        Cat cat = new Cat("Mitsi");
        Cow cow = new Cow("Moomoo");
//        Animal animal = new Animal();

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(cow);
    }
}
