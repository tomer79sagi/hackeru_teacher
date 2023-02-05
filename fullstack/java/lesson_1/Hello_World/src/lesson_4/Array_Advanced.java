package lesson_4;

import java.util.Arrays;

public class Array_Advanced {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,45,5,67,7,8,8}; // Array with 10 elements, cannot dynamically resize
        String[] strArray = {}; // Array with 0 elements
        String[] arrNames = new String[5]; // Empty array with 5 elements, cannot dynamically resize

        for (int i=0 ; i<arrNames.length ; i++) {
            arrNames[i] = "Tomer " + i;
        }

        System.out.println(Arrays.toString(arrNames));
    }
}
