package lesson_13.homework_1;

public class Animal {
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

    void makeSound() {
        System.out.println("Making sound");
    }
}
