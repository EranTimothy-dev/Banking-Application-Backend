package BankExceptions;

public class TransactionException extends Exception{

        public TransactionException(){
            super("Invalid Transaction!");
        }

        public TransactionException(String message){
            super(message);
        }
}
