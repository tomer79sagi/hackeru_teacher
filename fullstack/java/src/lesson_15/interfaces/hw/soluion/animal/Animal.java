package lesson_15.interfaces.hw.soluion.animal;

import lesson_15.interfaces.hw.soluion.db.IDB;
import lesson_15.interfaces.hw.soluion.report.IOutput;

public abstract class Animal
        implements IOutput, IDB {
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

    public boolean update(String value) {
        System.out.println("Updating '" + this.getClass() + "':" + value);

        return true;
    }
}
