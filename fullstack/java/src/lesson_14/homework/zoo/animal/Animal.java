package lesson_14.homework.zoo.animal;

public abstract class Animal {
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
