package Users;

import Accounts.BankAccount;

import java.util.ArrayList;
import java.util.Date;


public class AccountHolder extends Person {
    private ArrayList<BankAccount> userAccounts;

    public AccountHolder(String fullName, Date birthdate, String nic) {
        super(fullName, birthdate, nic);
        this.userAccounts = new ArrayList<>();
    }

    public void saveBankAccount(BankAccount account){
        this.userAccounts.add(account);
    }

    public void viewAllAccountsBalance(){
        int num = 1;
        for (BankAccount account: this.userAccounts){
            System.out.printf("%d. Balance in account (%s) : Rs. %.2f", num,account.getAccountNumber(), account.getBalance());
            num++;
        }
    }

}
