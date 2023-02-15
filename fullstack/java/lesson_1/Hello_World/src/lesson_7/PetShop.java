package lesson_7;

public class PetShop {
    public static void main(String[] args) {

        // Add a new dog to the PetShop
//        Dog dog = new Dog(); // new object of type 'Dog' (use the empty constructor)

        // Static method invocation
        Dog.maxDogsAllowedInShop = 20;
        Dog.printKnownBreeds();
        Dog.maxDogsAllowedInShop = 12;

        // Create an object of the 'full' constructor
        Dog dog1 = new Dog(50, 20, "Apchi", "Bonzo");
        Dog dog2 = new Dog(30, 15, "Johnny", "Chicken");

        Dog batata = new Dog("Batata");

        // Perform actions on dog1
        dog1.run();
        dog1.eat();
        dog1.play();

        // Perform actions on dog2
        dog2.run();
        dog2.eat();
        dog2.food = "Dogly";

        System.out.println(10); // Primitive, knows how to print
        System.out.println(true);
        System.out.println("Tomer");

        System.out.println(dog1 + "\n" + dog2);
    }
}
