package BankExceptions;

public class InvalidFormatException extends Exception {
    public InvalidFormatException(){
        super("Incorrect Format! Could not process input");
    }

    public InvalidFormatException(String message){
        super(message);
    }
}
