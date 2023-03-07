package lesson_3;

public class Exercise4_Numbers1 {
    public static void main(String[] args) {
        // Create new object of class type 'Exercise4_Numbers1' and assign it to 'exercise' variable
        Exercise4_Numbers1 exercise = new Exercise4_Numbers1();

//        exercise.zeroHundredRandom();
        exercise.fiveTenRandom();
    }

    private void zeroHundredRandom() {
        for (int i=0 ; i<10 ; i++) {

            // Option 1 - 0 to 100.99999 including floating point decimals
            float num = (float)Math.random() * 101;
            System.out.println( num > 100 ? 100f : num );

            // Ternary condition EXACTLY the same as the below
//            if (num > 100) {
//                num = 100;
//            }
//            System.out.println(num);

            // Option 2
            // Math.min(100, 77.343) ==> 77.343
            // Math.min(100, 100.4545454) ==> 100
            System.out.println(Math.min(100, num));
        }
    }

    private void fiveTenRandom() {
        // (0..0.99999 * 6) = 0..5.99999 + 5 = (int)5..10.999
        int num = (int)(Math.random() * 6 + 5);
        System.out.println(num);
    }

    private static void randomRange(int num1, int num2) {

    }
}
