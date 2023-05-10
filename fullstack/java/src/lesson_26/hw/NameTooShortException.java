package lesson_26.hw;

public class NameTooShortException
    extends RuntimeException {
    public NameTooShortException(String message) {
        super(message);
    }
}
