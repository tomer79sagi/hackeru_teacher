package lesson_14.interfaces.zoo.animal;

import lesson_14.interfaces.zoo.report.IOutput;

public abstract class Animal
        implements IOutput {
    private String name;

    public Animal(String name) {
        setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.length() < 5)
            throw new RuntimeException("Name must be at least 5 characters long");

        this.name = name;
    }

    public abstract void makeSound();

    public String toString() {
        return "Animal name: " + name;
    }
}
