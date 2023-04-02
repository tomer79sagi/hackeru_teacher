package lesson_19.optional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
//        Optional<String> name = Optional.of("Tomer");
        Optional<String> name = Optional.empty();

        if (name.isPresent()){
            System.out.println(name.orElse("No Name"));
        }
    }
}
