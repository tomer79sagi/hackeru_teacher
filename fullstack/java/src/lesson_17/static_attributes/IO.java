package lesson_17.static_attributes;

import java.util.Scanner;

public class IO {

    private final static Scanner in = new Scanner(System.in);

    // Wrapper for the 'Scanner' functionality - Make it easy to use input
    static public String nextString() {
        System.out.print("> ");
        return in.nextLine();
    }

    static public int nextInt() {
        System.out.print("> ");
        return in.nextInt();
    }
}
