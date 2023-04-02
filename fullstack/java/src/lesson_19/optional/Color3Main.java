package lesson_19.optional;

import lesson_19.optional.Color3Enum;

import java.util.Optional;

public class Color3Main {

    public static void main(String[] args) {
        Color3Enum c1 = Color3Enum.fromStringV1("Red");

//        Color3Enum c2 = Color3Enum.fromStringV2("Gray");

        Color3Enum c3 = Color3Enum.fromStringV3("Gray");
        System.out.println(c3);

        Optional<Color3Enum> c4 = Color3Enum.fromStringV4("KKK");
        System.out.println(c4.orElse(Color3Enum.GREEN));
    }
}


