package lesson_25.threads.e_name;

public class ThreadName {
    private int sheepCounter = 0;

    private synchronized void addSheep() {//mutex
        System.out.print(++sheepCounter + " ");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        //Single Sheep Herd:
        ThreadName herd = new ThreadName();

        for (int i = 0; i < 10; i++) {
            new Thread(herd::addSheep, "Thread " + i).start();
        }
    }
}
