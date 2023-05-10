package lesson_25.d_custom_exception;

public class NegativeRadiusException
        extends IllegalArgumentException {

    public NegativeRadiusException(String s) {
        super(s);
    }
}
