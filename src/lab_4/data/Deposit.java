package lab_4.data;

public class Deposit extends BankTransaction {
    public Deposit(double initialBalance) {
        super(initialBalance);
    }

    public void processTransaction(double amount) {
        balance += amount;
    }
}