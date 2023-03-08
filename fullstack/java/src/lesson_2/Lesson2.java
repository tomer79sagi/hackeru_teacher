package lesson_2;

import java.util.Scanner;
public class lesson2 {public static void main(String[] args) {

    // Input
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your age: ");

    byte d = input.nextByte();
//        System.out.println(d);

    // System.out.printf()
    String first_name = "Ahmad", last_name = "Qais";
//        System.out.println("Hi my name is " + first_name + ", and my last name " + last_name);

    // Similar to JS: `Hi my name is ${first_name}, and my last name ${last_name}`
    System.out.printf("Hi my name is %s %s, and I am %d years old",
            first_name, last_name, d);
}

}