package lesson_14.interfaces.hw.soluion.animal;

public class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.println("Mooo");
    }

    @Override
    public void report() {

    }

    @Override
    public void print() {

    }
}
