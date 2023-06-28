package exception;

public class EmployeeAlreadyAddException extends RuntimeException{
    public EmployeeAlreadyAddException(String message) {
        super(message);
    }
}
