package Accounts;
import BankExceptions.TransactionException;
import Users.AccountHolder;

import java.util.*;

public abstract class BankAccount {
    private AccountHolder user;
    private String accountNumber;
    private double balance;
    HashMap<Date, String> Transactions = new HashMap<>();


    public BankAccount(AccountHolder user, String accountNumber, double balance){
        this.user = user;
        this. accountNumber = accountNumber;
        this.balance = balance;
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

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void withdraw(float amount) throws TransactionException {
        if (amount < this.balance){
            this.balance = this.balance - amount;
            Date date = Calendar.getInstance().getTime();
            Transactions.put(date, String.format("-%s",amount));
            return;

        }
        throw new TransactionException("Insufficient Balance");
    }

    public void deposit(float amount) throws TransactionException{
        if (amount > 0){
            this.balance = this.balance + amount;
            Date date = Calendar.getInstance().getTime();
            Transactions.put(date, String.format("+%s",amount));
            return;
        }
        throw new TransactionException();
    }


    public void retrieveTransactions(){
        for (Map.Entry<Date,String> history: Transactions.entrySet()){
            System.out.println(history.getKey() + ": " + history.getValue());
        }
    }


}
