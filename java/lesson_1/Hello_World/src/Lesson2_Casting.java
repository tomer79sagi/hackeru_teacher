import java.util.Scanner;

public class Lesson2_Casting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = 6;

        int aNum = 7;
        int bNum = 9;
        float div = (float)7/9;

        System.out.println(div);

        System.out.println((double)myInt); // ==> Cast 'int' to 'double' just for output
        System.out.println((int)myDouble); // ==> Cast 'double' to 'int' just for output
    }
}
