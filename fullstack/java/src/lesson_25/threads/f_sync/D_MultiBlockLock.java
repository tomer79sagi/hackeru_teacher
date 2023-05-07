package lesson_25.threads.f_sync;

public class D_MultiBlockLock {
    private int sheepCounter = 0;
    private int dogCounter = 0;
    private static final Object LOCK = new Object();
    private static final Object LOCK2 = new Object();
    private void addSheep() {
        synchronized (LOCK) {//synchronized block (not the entire method)
            System.out.print(++sheepCounter + " ");
        }
    }
    private void addDog() {
        synchronized (LOCK2) {//synchronized block (not the entire method)
            System.out.print(++dogCounter + " ");
        }
    }
    public static void main(String[] args) {
        //Single Sheep Herd:
        D_MultiBlockLock herd = new D_MultiBlockLock();
        for (int i = 0; i < 10; i++) {
            new Thread(herd::addSheep, "Thread " + i).start();
            new Thread(herd::addDog, "Thread " + i).start();
        }
    }
}
