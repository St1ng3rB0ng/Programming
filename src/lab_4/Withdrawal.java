package lab_4;

public class Withdrawal extends BankTransaction {
    public Withdrawal(double initialBalance) {
        super(initialBalance);
    }

    public void processTransaction(double amount) {
        balance -= amount;
    }
}