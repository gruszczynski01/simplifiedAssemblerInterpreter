package excepions;

public class UnknownValueException extends RuntimeException{
    public UnknownValueException(String errorMessage) {
        super(errorMessage);
    }
}
