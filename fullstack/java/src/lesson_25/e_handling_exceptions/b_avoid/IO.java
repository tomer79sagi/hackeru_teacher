package lesson_25.e_handling_exceptions.b_avoid;

import java.util.Scanner;

public class IO {
    public static int nextInt(String message) {//message = "please enter your age"
        Scanner in = new Scanner(System.in);
        System.out.println(message + ":");

        while (true)
            try {
                String text = in.nextLine();
                return Integer.parseInt(text);
            } catch (NumberFormatException e) {
                System.out.println("Bad input");
                System.out.println(message + ":");
            }
    }

    public static int nextPositiveInt(String message) {
        int result = IO.nextInt(message);

        while (result < 0) {
            System.out.println("Cannot enter negative value.");
            result = IO.nextInt(message);
        }
        return result;
    }
}
