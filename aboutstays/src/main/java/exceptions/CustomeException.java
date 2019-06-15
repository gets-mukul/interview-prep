package exceptions;

public class CustomeException extends Exception{
    private String message;
    private Integer errorCode;

    public CustomeException(String message, Integer errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }
}
