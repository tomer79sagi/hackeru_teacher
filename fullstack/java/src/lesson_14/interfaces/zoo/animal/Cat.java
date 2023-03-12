package lesson_14.interfaces.zoo.animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void report() {

    }

    @Override
    public void print() {

    }
}
