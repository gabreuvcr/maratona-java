package academy.devdojo.jiraya.javacore.exception.exception.models;

public class InvalidLoginException extends Exception {
    
    public InvalidLoginException() {
        super("Invalid login");
    }

    public InvalidLoginException(String message) {
        super(message);
    }
}
