package lesson_19.optional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> name = searchName(2); // Name has 'null' value

        if (name.isPresent()) // CLEARER than 'if (name != null)'
        System.out.println(name.orElse("No Name"));
    }

    private static Optional<String> searchName(int num) {
        if (num == 1) {
            return Optional.of("Tomer");
        } else {
            return Optional.empty();
        }
    }
}
