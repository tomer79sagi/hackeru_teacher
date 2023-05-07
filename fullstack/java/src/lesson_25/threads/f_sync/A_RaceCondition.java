package lesson_25.threads.f_sync;

public class A_RaceCondition {
    private int sheepCounter = 0;

    private void addSheep() {
        System.out.print(++sheepCounter + " ");
    }

    public static void main(String[] args) {
        //Single Sheep Herd:
        A_RaceCondition race = new A_RaceCondition();

        for (int i = 0; i < 50; i++) {
            new Thread(race::addSheep).start();
        }
    }
}
