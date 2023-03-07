package lesson_6;

import java.util.Arrays;

public class Slide11 {
    public static void main(String[] args) {
//        option_1(); // Tomer
//        option_2(); // Aviad, Maksim

        // Test dynamic parameter in a method
        int[] arr = {3,34,5,6};
        print();
        print(5);
        print(5,5);
        print(5,5,3);
        print(arr);
    }

    // Can send any number of parameters of type 'int', including 1 parameter, 2 parameters, etc., including arrays
    static private void print(int... vars) {
        System.out.println(Arrays.toString(vars));
    }

    // Overloading the 'print' method + adding a dynamic parameter of type 'int'
    static private void print(String name, int... vars) {
        System.out.println(name);
        print(vars);
    }

    static private void option_1() {
        int[][] table = new int[4][5];

        // Create 2d array (populate 2nd row with data)
        int sum =0;
        for (int i = 0; i < table[2].length; i++) {
            if(i<=1){
                table[2][i] = i+2;
            }else{
                table[2][i] = sum;
            }
            sum += table[2][i];
        }

        // Print single row from the 2d array using 'Arrays.toString()'
        System.out.println(Arrays.toString(table[2]));

        // Print the 2d array
        for (int i = 0 ; i < table.length ; i++) {
//            printArray(table, i); // Call 'printArray' with two parameters (int[][], int)
            printArray(table[i]); // OVERLOADING: Call 'printArray' with one parameter (int[])
        }
    }

    static private void option_2() {
        int[][] table = new int[4][5];

        // Question no. 3: Populate 3rd row with these numbers: 2, 3, 5, 10, 20
        int sum = 20;
        for (int i = 0; i < 5; i++) {
            table[2][i] = sum;
            sum = (int)Math.ceil(sum/2.0); // Ceiling, 0.5 -> 1, 0.2 -> 1
//            sum = (int)Math.round(sum/2.0); // Round, 0.5 -> 1, 0.499999 -> 0, 0.5000000001 -> 1
        }

        System.out.println(Arrays.toString(table[2]));

        // Print the 2d array
        for (int i = 0 ; i < table.length ; i++) {
            printArray(table, i);
        }
    }

    // Overloading 'printArray' method with different parameters
    static private void printArray(int[] row) {
        for (int val : row) { // Similar to .forEach in JS
            System.out.printf("%d | ", val);
        }
        System.out.println();
    }

    static private void printArray(int[][] table, int i) {
        for (int j = 0 ; j < table[i].length ; j++) {
            System.out.printf("%d, %d | ", i, j);
        }
        System.out.println();
    }
}
