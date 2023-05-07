package lesson_25.threads.c_callback;

public class Main {

    public static void main(String[] args) {

        //async code, runs in the background (main thread is free)
        PumpkinFarmer.growPumpkin((pumpkin, exc) -> {
            if (exc == null) {
                System.out.println(pumpkin + "!");
            } else {
                //exc.printStackTrace();
                System.out.println(exc.getMessage());
            }
        });
        System.out.println("Main");
    }
}
