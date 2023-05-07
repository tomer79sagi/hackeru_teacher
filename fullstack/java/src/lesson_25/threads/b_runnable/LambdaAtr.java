package lesson_25.threads.b_runnable;

public class LambdaAtr {
    public static void main(String[] args) {
        var thread2 = new Thread(()->{
            System.out.println("Code that runs in the background");
        });
        thread2.start();
    }
}
