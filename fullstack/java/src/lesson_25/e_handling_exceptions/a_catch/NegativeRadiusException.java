package lesson_25.e_handling_exceptions.a_catch;

public class NegativeRadiusException extends IllegalArgumentException {
    public NegativeRadiusException() {
        super();
    }

    public NegativeRadiusException(String s) {
        super(s);
    }
}
