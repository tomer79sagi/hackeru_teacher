package lesson_25.threads.f_sync;

public class B_Sync {
    private int sheepCounter = 0;

    private synchronized void addSheep() {//mutex
        System.out.print(++sheepCounter + " ");
    }

    public static void main(String[] args) {
        B_Sync herd = new B_Sync();

        for (int i = 0; i < 50; i++) {
            new Thread(herd::addSheep).start();
        }
    }
}
