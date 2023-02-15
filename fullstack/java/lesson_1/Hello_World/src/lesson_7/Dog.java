package lesson_7;

import java.util.Arrays;

public class Dog {

    static int maxDogsAllowedInShop;
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

    public Dog(String name) {
        this.name = name;

        this.weight = doX();
    }

    public static void printKnownBreeds() {
        String[] breeds  = {"Pincher", "Rotweiler", "Golden Retriever", "Haski"};
        System.out.println(Arrays.toString(breeds));
    }

    public void eat() {
        System.out.printf("%s is eating\n", this.name);
    }

    public void run() {
        System.out.printf("%s is running\n", this.name);
    }

    public void play() {
        System.out.printf("%s is playing the guitar\n", this.name);
    }

    @Override
    public String toString() {
        return this.name + ": " + this.height + "cm | " + this.weight + "kg";
    }

    // Overloading 'toString()'
    public String toString(int type) {
        return this.name + "Last visit";
    }
}
