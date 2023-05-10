package lesson_x.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryFinally {

    static String readFirstLineFromFileWithFinallyBlock(String path) {

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            return br.readLine();
        } catch(IOException e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
                fr.close();
            } catch(IOException e){
                System.out.println(e);
            }
        }

        return null;
    }

    static String readFirstLineFromFile(String path) throws IOException {
        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {
            return br.readLine();
        }
    }

    static String readFirstLineFromFileWithFinallyBlockB(String path) throws IOException {

        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        try {
            return br.readLine();
        } catch(IOException e) {
            System.out.println(e);
        } finally {
            br.close();
            fr.close();
        }

        return null;
    }

    public static void main(String[] args) {
        String s = readFirstLineFromFileWithFinallyBlock("123.txt");
//        String s = readFirstLineFromFile("123.txt");
//        String s = readFirstLineFromFileWithFinallyBlockB("123.txt");

        System.out.println(s);
    }
}
