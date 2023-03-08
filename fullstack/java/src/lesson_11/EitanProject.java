package lesson_11;

public class EitanProject {
    public static void main(String[] args) {

        boolean isExit = false;

        // Option 2: Labeled statement
        exitLabel:
        do {
            // Menu
            switch (2) {
                case 1:
//                    getStudentList();
                    break;
                case 2:
//                    addStudent();
                    break;
                case 3:
//                    removeStudent();
                    break;
                case 4:
//                    secondMenu();
                    break;
                case 5:
                    System.out.println("You ara out of the system");

                    // Option 1
//                    isExit = true;

                    // Option 2
                    break exitLabel;

                    // Option 3
//                    System.exit(0);
            }
        // Option 1
        } while (!isExit);

        // Option 2
        // Don't need anything

        // Option 3
//        } while (true);
    }
}
