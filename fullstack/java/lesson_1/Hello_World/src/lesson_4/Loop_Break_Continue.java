package lesson_4;

public class Loop_Break_Continue {
    public static void main(String[] args) {

        boolean flag = false;

        for (int i=0 ; i<300 && flag == false; i++) {

            // Print row
            for (int j=0 ; j<300 && !flag ; j++) {
                if ((i * j) % 17 == 5) {
                    System.out.printf("%d | %d \n", i, j);
                    flag = true;
                }
            }
        }
    }
}
