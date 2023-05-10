package lesson_26.hw.io;

public class Main {
    public static void main(String[] args) {
        String entireString = "";
        String oneName;

        for (int i = 0; i < 5 ; i++) {
            oneName = IO.nextString("Please provide a name");
            entireString += oneName + "\n";
        }

        FileIO.writeToFile("123.txt", entireString);
    }
}
