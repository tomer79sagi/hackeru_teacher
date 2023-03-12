package lesson_14.interfaces.zoo.animal;

import lesson_14.interfaces.zoo.report.IReport;
import lesson_14.interfaces.zoo.report.Printable;

public abstract class Animal
        implements Printable, IReport {
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
