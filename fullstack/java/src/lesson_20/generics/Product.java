package lesson_20.generics;

import kotlin.Pair;

public class Product<K, V> {

    K key;
    V value;

    public Product(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static void main(String[] args) {
        Product<Integer, String> p = new Product<>(12, "Laptop");
        Product<String, Boolean> p2 = new Product<>("PC", true);
    }
}
