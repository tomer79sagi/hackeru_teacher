package lesson_25.h_writing_to_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {
    public static void writeToFile(String filename, String data){
        //Path = path to write to
        Path path = Paths.get(filename);

        try {
            Files.write(path,data.getBytes());
        } catch (IOException e) {
            System.out.println("Cant write to file " + path);
            System.out.println("Close file if it's open");
            System.out.println("or Contact sys admin");
        }
    }

    public static void main(String[] args) {
        FileIO.writeToFile("123.txt", "Hello, World.\nHave a good day.");
    }
}
