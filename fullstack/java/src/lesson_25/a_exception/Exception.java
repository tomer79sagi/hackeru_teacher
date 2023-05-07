package lesson_25.a_exception;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Print your age: ");
        String input = in.next();

        try {
            int age = Integer.parseInt(input);
            System.out.println(age); // Might or might not reach this code, depending on if Exception is thrown
        } catch(NumberFormatException e) {
            System.out.println(e);
        }
    }
}
