package _class_project.part_3;

import java.util.Scanner;

public class IO {

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
