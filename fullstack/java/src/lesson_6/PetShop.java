package lesson_6;

public class PetShop {
    public static void main(String[] args) {

        // Add a new dog to the PetShop
//        Dog dog = new Dog(); // new object of type 'Dog' (use the empty constructor)

        // Create an object of the 'full' constructor
        Dog dog1 = new Dog(50, 20, "Apchi", "Bonzo");
        Dog dog2 = new Dog(30, 15, "Johnny", "Chicken");

        // Perform actions on dog1
        dog1.run();
        dog1.eat();
        dog1.play();
        System.out.println(dog1.name);

        // Perform actions on dog2
        dog2.run();
        dog2.eat();
        System.out.println(dog2.height);

        dog2.food = "Dogly";
        System.out.println(dog2.food);
    }
}
