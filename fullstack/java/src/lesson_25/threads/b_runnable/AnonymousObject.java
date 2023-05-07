package lesson_25.threads.b_runnable;

public class AnonymousObject {
    public static void main(String[] args) {
        var thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Code that runs in the background");
            }
        });
        thread1.start();
    }
}
