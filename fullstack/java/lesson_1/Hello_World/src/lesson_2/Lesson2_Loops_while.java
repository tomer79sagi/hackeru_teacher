package lesson_2;

public class Lesson2_Loops_while {
    public static void main(String[] args) {

        // LOOP - while
//        int y = 0;
//
//        while (y<100) {
//            y++;
//            System.out.println(y);
//        }
//
//        System.out.println(y);

        // LOOP - for
//        for (int i=0 ; i<10 ; i++) {
//            System.out.println(i);
//        }

        // LOOP - loop inside loop
//        for (int i=0 ; i<3 ; i++) {
//
//            System.out.println(i);
//
//            for (int j=0 ; j<5 ; j++) {
//                System.out.println(" " + j);
//            }
//        }

        // LOOP - loop inside loop (pyramid)
        for (int i=1 ; i<=5 ; i++) {

            // Print row
            for (int j=0 ; j<i ; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
