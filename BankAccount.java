public class BankAccount {
    private double balance;

    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid amount or insufficient funds. Withdrawal failed.");
        }
    }

   
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
     
        BankAccount account = new BankAccount(1000);

       
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(1500);

        System.out.println("Current balance: " + account.getBalance());
    }
}

