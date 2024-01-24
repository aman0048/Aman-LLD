package designPatterns.builder;

public class InvalidGraduationException extends RuntimeException {
    public InvalidGraduationException() {
    }

    public InvalidGraduationException(String message) {
        super(message);
    }

    public InvalidGraduationException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidGraduationException(Throwable cause) {
        super(cause);
    }

    public InvalidGraduationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
