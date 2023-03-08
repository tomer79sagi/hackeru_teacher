package lesson_5;

public class ArrayOfArrays {
    public static void main(String[] args) {
        // 1D Array (1 dimension)
        int[] arr1 = {1,2,3,4,5};

        // 2D Array (2 dimensions)
        // Example: Array of students names in each lesson
        //  - 1D[] = Lessons (rows)
        //  - 2D[] = Student names (columns)
        String[][] attendance = {
            {"Erez", "Shimon", "Tal", "Eitan"}, // row 1
            {"Erez", "Daniel", "Alex Drozdov", "Alex Dedenko"}, // row 2
            {"Erez", "Shimon", "Alex Drozdov", "Eitan"} // row 3
        };

        System.out.println(attendance[0][1]); // ==> Shimon (from row 1)
        System.out.println(attendance[1][3]); // ==> Alex Dedenko (from row 2)
        System.out.println(attendance[2][2]); // ==> Alex Drozdov (from row 3)
    }
}
