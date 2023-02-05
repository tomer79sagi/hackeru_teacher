package lesson_4;

public class Conditions {
    public static void main(String[] args) {
//        breakWithFlag();
        breakWithLabeledStatement();
        continueExample();
    }

    static void breakWithFlag() {
        boolean flag = false;

        for (int i = 0; i <300 && flag == false; i++) {

            for (int j = 0; j <300 && flag == false ; j++) {
                if ((i * j) % 17 == 5) {
                    System.out.printf("%d | %d \n", i, j);
                    flag = true;
                }

            }
        }
    }

    static void breakWithLabeledStatement() {
        myLabel:
        for (int i = 0; i <300 ; i++) {

            for (int j = 0; j <300 ; j++) {
                if ((i * j) % 17 == 5) {
                    System.out.printf("%d | %d \n", i, j);
                    break myLabel;
                }

            }
        }
    }

    static void continueExample() {
        for (int j = 0; j <300 ; j++) {
            if (j % 2 == 0) {
                continue;
            }

            System.out.printf("%d \n", j);
        }
    }
}
