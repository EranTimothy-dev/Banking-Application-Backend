import BankExceptions.TransactionException;

import java.util.Objects;

public class BankAccount {
    private AccountHolder user;
    private String accountNumber;
    private float balance;
    private String accountType;

    public BankAccount(AccountHolder user, String accountNumber, int balance, String accountType){
        this.user = user;
        this. accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void setUser(AccountHolder user){
        this.user = user;
    }

    public AccountHolder getUser(){
        return this.user;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(float balance){
        this.balance = balance;
    }

    public float getBalance(){
        return this.balance;
    }

    public void withdraw(float amount) throws TransactionException {
        if (amount < this.balance){
            this.balance = this.balance - amount;
            return;
        }
        throw new TransactionException("Insufficient Balance");
    }

    public void setAccountType(String accountType) throws TransactionException{
        if (Objects.equals(accountType, "sa")){
            this.accountType = "Savings account";
            return;
        } else if (Objects.equals(accountType, "FD")){
            this.accountType = "Fixed Deposit";
            return;
        }
        throw new TransactionException("Invalid Account Type: " + accountType);
    }

    public String getAccountType(){
        return this.accountType;
    }


}
