
    public class ActiveState implements AccountState{


        public void deposit(Double depositAmount, Account account){
            
            account.balance = account.balance + depositAmount;
            System.out.println("Amount Deposited: "+ depositAmount);
            account.toString();
        }
    
    
        public void withdraw(Double withdrawAmount, Account account){
            account.balance = account.getBalance() - withdrawAmount;
            System.out.println("Amount Withdraw: " + withdrawAmount);
            account.toString();
        }
    
    
        public void suspend(Account account){
            System.out.println("Account is suspended!");
            account.setState(new SuspendState());
            
        }
    
     
        public void activate(Account account){
            System.out.println("Account is already Activated");
        }
    
       
        public void close(Account account){
            account.setState(new ClosedState());
            System.out.println("Account is Closed!");
        }
    }
