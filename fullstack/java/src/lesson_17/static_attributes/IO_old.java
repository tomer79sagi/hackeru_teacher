package lesson_17.static_attributes;

import java.util.Scanner;

public class IO_old {

    // Wrapper for the 'Scanner' functionality - Make it easy to use input
    static public String nextString() {
        Scanner input = new Scanner(System.in);
        System.out.print("> ");
        return input.nextLine();
    }

    static public int nextInt() {
        Scanner input = new Scanner(System.in);
        System.out.print("> ");
        return input.nextInt();
    }
}
