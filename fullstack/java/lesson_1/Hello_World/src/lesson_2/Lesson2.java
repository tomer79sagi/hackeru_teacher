package lesson_2;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {

        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");

        byte d = input.nextByte();

        String first_name = "Tomer", last_name = "Sagi";

        // 'System.out.println()' example - print a single variable
//        System.out.println("Hi my name is " + first_name + " " + last_name + ", and I am " + d + " years old");

        // 'System.out.printf()' example - Format the output
        // Similar to JS: `Hi my name is ${first_name}, and my last name ${last_name}`
        System.out.printf("Hi my name is %s %s, and I am %d years old", first_name, last_name, d);
        System.out.println();

        // Modulus
        int ageModulus = d % 5;
        System.out.printf("Age modulus 5 is %d", ageModulus);
    }
}
