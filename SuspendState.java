public class SuspendState implements AccountState{

        public void deposit(Double depositAmount, Account account){
            System.out.println("You cannot deposit on suspended account!");
            account.toString();
        }
        
        public void withdraw(Double withdrawAmount, Account account){
            System.out.println("You cannot withdraw on suspended account!");
            account.toString();
        }
        
        public void suspend(Account account){
            System.out.println("You cannot suspend a closed account!");
        }
        
        public void activate(Account account){
            account.setState(new ActiveState());
            System.out.println("Account is Activated!");
        }
        
        public void close(Account account){
            account.setState(new ClosedState());
            System.out.println("Account is Closed!");
    
        }
}
  
