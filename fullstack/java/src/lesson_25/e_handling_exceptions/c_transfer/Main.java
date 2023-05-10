package lesson_25.e_handling_exceptions.c_transfer;

import lesson_25.e_handling_exceptions.b_avoid.IO;

import java.io.IOException;

public class Main {

    // 2
    void n() throws IOException {
//        try {
//            throw new IOException();
//        } catch (IOException e) {
//            System.out.println("Format exception");
//        }

        throw new IOException(); // Creates Exception
    }

    // 1
    void p() throws IOException {
        n(); // 2
    }

    // 0
    public static void main(String args[]){
        Main obj = new Main();

        try {
            obj.p();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("normal flow...");
    }
}
