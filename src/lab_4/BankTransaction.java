package lab_4;

public abstract class BankTransaction {
    protected double balance;

    public BankTransaction(double initialBalance) {
        this.balance = initialBalance;
    }

    public abstract void processTransaction(double amount);

    public double getBalance() {
        return balance;
    }
}