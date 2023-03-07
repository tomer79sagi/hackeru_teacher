package lesson_8;

import java.util.Arrays;

public class DynamicArray {

    int[] arr = new int[0];

    public static void main(String[] args) {
//        int[] arr = new int[3];
//        arr[3] = 7;
//        System.out.println(arr[3]);

        DynamicArray instArr = new DynamicArray();
        instArr.add(7);

        DynamicArray instArr2 = new DynamicArray();
        instArr2.add(7);
    }

    public void add(int value) {
        // 1. Extend array by duplicating it and creating a new array with length+1
        this.arr = Arrays.copyOf(this.arr, this.arr.length + 1);
        this.arr[this.arr.length - 1] = value;
    }
}
