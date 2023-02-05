package lesson_4;

public class Array_Strings {
    public static void main(String[] args) {
        String name = "Tomer Sagi";

        // String similar to 'Array', can use 'length()' and 'charAt(i)'
        for (int i=0 ; i<name.length() ; i++) {
            char letter = name.charAt(i);
            System.out.println(letter + " | " + (int)letter);
//            System.out.println(name.charAt(i) + " | " + (int)name.charAt(i));
        }
    }
}
