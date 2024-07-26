package Accounts;

import Users.AccountHolder;

public class FixedDeposit extends BankAccount{
    private final String depositPeriod;

    public FixedDeposit(AccountHolder user, String accountNumber, double balance, String depositPeriod){
        super(user, accountNumber, balance);
        this.depositPeriod = depositPeriod;
    }

    @Override
    public double getReturnOnInvestment(int timePeriod) {
        if (timePeriod < 2){
            double interest = (((this.getBalance() * 12.5)/100)* timePeriod);
            return this.getBalance() + interest;
        } else if (timePeriod < 5) {
            double interest = (((this.getBalance() * 16.5)/100)*timePeriod);
            return this.getBalance() + interest;
        }
        double interest = (((this.getBalance() * 20)/100)*timePeriod);
        return this.getBalance() + interest;
    }
}
