package exception;

class InsufficientBalanceExceptions extends Exception{
    public InsufficientBalanceExceptions(String message) {
        super(message);
    }
}

class BankAccount{
    double balance;
    BankAccount(double balance){
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceExceptions {
        if(amount>balance){
            throw new InsufficientBalanceExceptions("Balance is insufficient  and the current balance is "+balance);
        }else{
            balance-=amount;
            System.out.println("Amount debited successfully and the current balance is "+ balance);
        }
    }
}
public class LearnCustomsExceptions {
    public static void main(String[] args) throws InsufficientBalanceExceptions {
        BankAccount icici = new BankAccount(1000.0);
        try{
        icici.withdraw(10000);
        }catch (InsufficientBalanceExceptions e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Always Execute");
        }
    }
}
