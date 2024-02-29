public class Account{

    String accountNumber = "";

    double balance;

    private AccountState accountState;

    public Account(String accountNumber, Double balance){

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActiveState();

    }

    public AccountState getState(){
        return accountState;
    }

    void setState(AccountState accountState){
        this.accountState = accountState;
    }

    void deposit(Double depositAmount){
        accountState.deposit(depositAmount, this);
    }
    void withdraw(Double withdrawAmount){
        accountState.withdraw(withdrawAmount, this);
    }
    void suspend(){
        accountState.suspend(this);
   
    }
    void activate(){
        accountState.activate(this);

    }
    void close(){
        accountState.close(this);
    }
    public String toString(){
        System.out.println("Account Number: " + accountNumber + " \nAccount Balance: " + balance);
        return "";
    }

    void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    String getAccountNumber(){
        return accountNumber;
    }

    void setBalance(Double balance){
        this.balance  = balance;
    }

    double getBalance(){
         return balance;
    }

    public AccountState getAccountState() {
        return accountState;
    }

    void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

}
