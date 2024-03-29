package lesson_4;

import java.util.Arrays;

public class Array_Simple {
    public static void main(String[] args) {
        String[] studentNames = {"Eitan", "Tal", "Aviad", "Yarin"};
        int[] studentGrades = {78, 99, 34, 88};

        // 1. Classic form
        for (int i=0 ; i<studentNames.length ; i++) {
            System.out.printf("Name: %s, Grade: %d \n", studentNames[i], studentGrades[i]);
        }

        // 2. forEach
        // JS: studentNames.forEach(name => { alert() });
        for (String name : studentNames) {
            System.out.println(name);
        }

        // Print array
        System.out.println(studentNames); // ==> Prints object
        System.out.println(Arrays.toString(studentNames)); // ==> Converts array to a 'printable' and 'user friendly' String
    }
}
