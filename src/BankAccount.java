import BankExceptions.TransactionException;

import java.util.*;

public class BankAccount {
    private AccountHolder user;
    private String accountNumber;
    private double balance;
    private String accountType;
    HashMap<Date, String> Transactions = new HashMap<>();


    public BankAccount(AccountHolder user, String accountNumber, double balance, String accountType){
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

    public double getReturnOnInvestment(int timePeriod){
        if (Objects.equals(this.accountType, "sa")){
            double interest = ((this.balance * 2)/100)* timePeriod;
            return this.balance + interest;
        } else {
            if (timePeriod < 2){
                double interest = (((this.balance * 12.5)/100)* timePeriod);
                return this.balance + interest;
            } else if (timePeriod < 5) {
                double interest = (((this.balance * 16.5)/100)*timePeriod);
                return this.balance + interest;
            }
            double interest = (((this.balance * 20)/100)*timePeriod);
            return this.balance + interest;
        }

    }

    public void retrieveTransactions(){
        for (Map.Entry<Date,String> history: Transactions.entrySet()){
            System.out.println(history.getKey() + ": " + history.getValue());
        }
    }


}
