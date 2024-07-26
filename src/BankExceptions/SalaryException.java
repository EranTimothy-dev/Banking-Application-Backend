package BankExceptions;

public class SalaryException extends Exception{

    public SalaryException(){
        super("Invalid Salary Amount Entered!");
    }

    public SalaryException(String message){
        super(message);
    }
}
