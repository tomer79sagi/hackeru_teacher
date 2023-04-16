package lesson_20.generics;

import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5,6,7};

        Arrays.stream(nums).toList();
    }
}
