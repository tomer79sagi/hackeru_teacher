public class Lesson2_Math_random {
    public static void main(String[] args) {
        // ==> Math.random() - 0 > 0.999999 | * 101 => 0 - 100.9999999
        int grade = (int)(Math.random() * 101);

        // Regular IF
//        if (grade >= 56) {
//            System.out.printf("%d = Passed", grade);
//        } else {
//            System.out.printf("%d = Failed", grade);
//        }

        // Ternary IF (phase 1)
        String result = grade >= 56 ? "Passed" : "Failed"; // Use ternary condition to set the result of the grade in words
        System.out.printf("%d --> %s", grade, result);

        // Ternary IF (phase 2)
        System.out.printf("%d --> %s", grade, (grade >= 56 ? "Passed" : "Failed"));
    }
}
