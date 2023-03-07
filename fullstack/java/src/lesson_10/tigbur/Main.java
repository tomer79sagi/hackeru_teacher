package lesson_10.tigbur;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[4];

        for (int i=0 ; i<students.length ; i++) {
            // Option 1: without a 'usable' constructor (only empty constructor exists)
//            students[i] = new Student();
//            students[i].name = "Tomer" + (int)(Math.random() * 10);

            // Option 2: WITH a 'usable', as required, constructor, to provide LESS code, less duplication.
            students[i] = new Student("Tomer" + (int)(Math.random() * 10));
        }

        students[2] = new Student("Tomer", "Sagi");

        System.out.println(Arrays.toString(students));
    }
}
