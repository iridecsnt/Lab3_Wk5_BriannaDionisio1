package lab3;

public class SavingsAccount_BD extends BankAccount_BD {
    private static final double MIN_BALANCE = 50.0;

    public SavingsAccount_BD(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Withdrawal denied. Balance cannot fall below $" + MIN_BALANCE);
        }
    }
}