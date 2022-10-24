package site.telion.lesson_2_32_12springjunit.exception;

public class DivideByNullException extends IllegalArgumentException {

    public DivideByNullException() {
    }

    public DivideByNullException(String message) {
        super(message);
    }

    public DivideByNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public DivideByNullException(Throwable cause) {
        super(cause);
    }
}
