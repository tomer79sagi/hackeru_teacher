package lesson_25.threads.f_sync;

public class C_BlockLock {
    private int asyncCounter = 0;
    private int syncCounter = 0;
    private int syncAfterCounter = 0;
    private static final Object LOCK = new Object();

    private void addSheep() {
        System.out.println(++asyncCounter + " Before Lock");
        synchronized (LOCK) {//synchronized block (not the entire method)
            System.out.println("  " + ++syncCounter + " Inside Lock");
        }
        System.out.println("    " + ++syncAfterCounter + " After Lock");
    }

    public static void main(String[] args) {
        //Single Sheep Herd:
        C_BlockLock herd = new C_BlockLock();

        for (int i = 0; i < 10; i++) {
            new Thread(herd::addSheep, "Thread " + i).start();
        }
    }
}
