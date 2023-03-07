package lesson_6;

public class Dog {
    int height;
    int weight;
    String name;
    String food;
    boolean isForSale = false;

    public Dog() {
    }

    public Dog(int height, int weight, String name, String food) {
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.food = food;
    }

    void eat() {
        System.out.printf("%s is eating\n", this.name);
    }

    void run() {
        System.out.printf("%s is running\n", this.name);
    }

    void play() {
        System.out.printf("%s is playing the guitar\n", this.name);
    }


    static public void doX() {
        // static ==> Dog.doX(); DOESN'T need to use 'new', i.e. we don't need to create an OBJECT
        // NOT static ==> Dog dog = new Dog();, dog.doX();
//        this.name = "Tomer";
    }
}
