package Accounts;

import Users.AccountHolder;

public class FixedDeposit extends BankAccount{
    private final int depositPeriod;

    public FixedDeposit(AccountHolder user, String accountNumber, double balance, int depositPeriod){
        super(user, accountNumber, balance);
        this.depositPeriod = depositPeriod;
    }

    public double getReturnOnInvestment() {
        if (depositPeriod < 2){
            double interest = (((this.getBalance() * 12.5)/100)* depositPeriod);
            return this.getBalance() + interest;
        } else if (depositPeriod < 5) {
            double interest = (((this.getBalance() * 16.5)/100)*depositPeriod);
            return this.getBalance() + interest;
        }
        double interest = (((this.getBalance() * 20)/100)*depositPeriod);
        return this.getBalance() + interest;
    }
}
