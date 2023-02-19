package lesson_8;

import java.util.stream.Stream;

public class StringMethods {
    public static void main(String[] args) {
//        q1();
//        q2();
        q3();
    }

    public static void q1() {
        char[] data = {'a', 'b', 'c'};
        String str = new String(data);

        System.out.println(str);
    }

    public static void q2() {
        String str = "Hello, World";

        // Option 1
        String str2 = new String(str.toCharArray(), str.length() - 5, 5);

        // Option 2
        String str3 = str.substring(str.length() - 5);

        System.out.println(str2);
        System.out.println(str3);
    }

    public static void q3() {
        String str = "Hello, World";

        // Class 'Stream'
//        Stream stream = (Stream)str.chars();
//        stream.filter();
//        stream.map();
//        stream.forEach();

        int countChar = (int)str.chars().filter(ch -> ch == 'l').count();
        System.out.println(countChar);
    }
}
