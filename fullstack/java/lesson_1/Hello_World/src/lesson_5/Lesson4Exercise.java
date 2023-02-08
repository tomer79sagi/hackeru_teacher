package lesson_5;

import java.util.Arrays;

public class Lesson4Exercise {
    public static void main(String[] args) {
        byte[] arr = new byte[10];

        // A) Populate A) the empty array of 10 elements
        for (int i=0 ; i<arr.length ; i++) {
            // Math.random ==> 0...0 (0...0.99)
            // Math.random * 11 ==> 0...10 (0...10.99)
            // Math.random * 10 ==> 0...9 (0...9.99)
            // (Math.random * 10) + 1 ==> 1..10 (1...10.99)
            arr[i] = (byte)(Math.random() * 10 + 1);
        }

        // B) Print the array
        System.out.println(Arrays.toString(arr));

        // C) Find pairs that sum to 9
        //  - Option 1: Create loop inside loop to find the pair
        boolean isFoundPair = false;

        for (int i=0 ; i<arr.length-1 && isFoundPair == false ; i++) { // Iterate until the 'one before last' element in the array
            for (int j=i+1 ; j<arr.length && isFoundPair == false ; j++) {
                System.out.println(arr[i] + " | " + arr[j]);

                // Once we find a match, raise the flag ==> 'isFoundPair = true'
                if (arr[i] + arr[j] == 9) {
                    System.out.printf("Pair: %d (%d) | %d (%d)", arr[i], i, arr[j], j);
                    isFoundPair = true;
                }
            }
        }

        if (!isFoundPair) {
            System.out.println("Didn't find a pair");
        }
    }
}
