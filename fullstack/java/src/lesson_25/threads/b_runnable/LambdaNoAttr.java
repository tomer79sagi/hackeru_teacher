package lesson_25.threads.b_runnable;

public class LambdaNoAttr {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("Thread 1");
            System.out.println("Code that runs in the background");
        }).start();
    }
}
