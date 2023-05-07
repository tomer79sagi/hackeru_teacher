package lesson_25.threads.a_thread;

public class DemoThread extends Thread {

    //props:
    private final char c;

    //ctor:
    public DemoThread(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.printf("%s", c);
            if (i % 10 == 0)
                System.out.println();
        }
    }
}
