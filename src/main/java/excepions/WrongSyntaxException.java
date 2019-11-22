package excepions;

public class WrongSyntaxException extends RuntimeException {
    public WrongSyntaxException(String errorMessage) {
        super(errorMessage);
    }
}

