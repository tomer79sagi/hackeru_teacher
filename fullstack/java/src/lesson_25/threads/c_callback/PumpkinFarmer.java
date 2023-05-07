package lesson_25.threads.c_callback;

public class PumpkinFarmer {
    //async method can't return a value:
    public static void growPumpkin(OnPumpkinReadyListener callback) {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(1000 * 5);
                callback.pumpkinReady("Orange Pumpkin � � ", null);
            } catch (InterruptedException e) {
                callback.pumpkinReady(null, new BadPumpkinException("Error generating your pumpkin"));
            }
        });

        t.start();
//        t.interrupt();
    }

    public interface OnPumpkinReadyListener {
        void pumpkinReady(String pumpkin, Exception e);
    }

    public static class BadPumpkinException extends Exception {
        public BadPumpkinException(String message) {
            super(message);
        }
    }
}
