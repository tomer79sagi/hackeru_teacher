package lesson_20;

import lesson_20.Color3Enum;

import java.util.Optional;

public class Color3Main {

    public static void main(String[] args) {
        System.out.println("Before");
        Color3Enum e = Color3Enum.BLUE;

//        Color3Enum e = Color3Enum.fromStringV3("blue"); // Search, use stream().filter --> x1 times search algorithm
//        Color3Enum e = Color3Enum.fromStringV3("blue"); // Search, use stream().filter --> x2 times search algorithm | o(n)
//        Color3Enum e = Color3Enum.fromStringV3("blue"); // Search, use stream().filter --> x3 times search algorithm | o(n)
//        Color3Enum e = Color3Enum.fromStringV3("blue"); // Search, use stream().filter --> x4 times search algorithm
//        Color3Enum e = Color3Enum.fromStringV3("blue"); // Search, use stream().filter --> x5 times search algorithm
        System.out.println("After");
    }
}


