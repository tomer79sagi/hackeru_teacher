package lesson_25.threads.a_thread;

public class Main {
    public static void main(String[] args) {
        var thread1 = new DemoThread('$');
        var thread2 = new DemoThread('#');
        var thread3 = new DemoThread('@');

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
