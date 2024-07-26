package Accounts;

import Users.AccountHolder;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(AccountHolder user, String accountNumber, double balance){
        super(user, accountNumber, balance);
    }

    @Override
    public double getReturnOnInvestment(int timePeriod){
        double interest = ((this.getBalance() * 2)/100)* timePeriod;
        return this.getBalance() + interest;
    }
}
