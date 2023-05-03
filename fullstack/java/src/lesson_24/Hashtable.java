package lesson_24;

public class Hashtable<K, V> {
    // 'table' is the Array that will hold all the Hashtable data
    // Array of type V
    private V[] table = (V[]) new Object[10];

    // Create an 'index' to be used to store the values in the 'table' Array
    // We need to match the index value to the size of the 'table' Array
    // We need to make sure the number is positive (because indexes must be positive numbers)
    // We need to round the numbers if required
    private int hash(K k) {
        System.out.println("Hash: " + k.hashCode() + " ; " + (k.hashCode() % table.length));
        return k.hashCode() % table.length;
    }

    public void put(K key, V value) {
        table[hash(key)] = value;
    }

    public static void main(String[] args) {
        // ID, Student Name
        Hashtable<String, String> students = new Hashtable<>();
        students.put("23", "Tomer");
        students.put("44", "Jeff");
    }
}

