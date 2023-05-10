package lesson_25.g_finally;

public class FinallyExample {
    public static void main(String args[]) {
        try {
            System.out.println("Inside try block");
            // below code throws divide by zero exception
            int data=25/3;
            System.out.println(data);
        } catch (ArithmeticException e) { // handles the Arithmetic Exception / Divide by zero exception
            System.out.println("Exception handled");
            System.out.println(e);
        } finally { // executes regardless of exception occurred or not
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of the code...");
    }
}
