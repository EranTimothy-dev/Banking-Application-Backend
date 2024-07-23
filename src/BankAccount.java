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

    public void setAccountType(String accountType) throws Exception{
        if (Objects.equals(accountType, "sa")){
            this.accountType = "Savings account";
            return;
        } else if (Objects.equals(accountType, "FD")){
            this.accountType = "Fixed Deposit";
            return;
        }
        throw new Exception("Invalid Account Type: " + accountType);
    }

    public String getAccountType(){
        return this.accountType;
    }


}
