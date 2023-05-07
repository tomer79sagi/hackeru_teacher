package lesson_25.threads.d_sleep;

import java.time.LocalTime;

public class Sleep {
    public static void main(String[] args) {
        var thread1 = new Thread(()->{
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    System.out.println(LocalTime.now());
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
            }
        });

        //program continues:

        thread1.start();
        try {
            Thread.sleep(10000);
            thread1.interrupt();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
