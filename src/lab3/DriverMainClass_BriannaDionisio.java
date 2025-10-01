package lab3;

import java.util.Scanner;

public class DriverMainClass_BriannaDionisio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Bank Account ---
        System.out.print("Enter account number for Bank Account: ");
        String accNo = sc.nextLine();
        BankAccount_BD account1 = new BankAccount_BD(accNo, 1500);

        System.out.println("\n--- Bank Account Transactions ---");
        System.out.println("Initial balance: $" + account1.getBalance());

        // Deposit
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account1.deposit(depositAmount);
        System.out.println("New balance after deposit: $" + account1.getBalance());

        // First withdrawal
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount1 = sc.nextDouble();
        account1.withdraw(withdrawAmount1);
        System.out.println("New balance after withdrawal: $" + account1.getBalance());

        // Second withdrawal
        System.out.print("Enter another amount to withdraw: ");
        double withdrawAmount2 = sc.nextDouble();
        account1.withdraw(withdrawAmount2);
        System.out.println("Balance after withdrawal: $" + account1.getBalance());

        sc.nextLine(); // clear buffer

        // --- Savings Account ---
        System.out.print("\nEnter account number for Savings Account: ");
        String accNo2 = sc.nextLine();
        SavingsAccount_BD savings = new SavingsAccount_BD(accNo2, 500);

        System.out.println("\n--- Savings Account Transactions ---");
        System.out.println("Initial balance: $" + savings.getBalance());

        // Savings withdrawal
        System.out.print("Enter amount to withdraw from Savings Account: ");
        double withdrawAmount3 = sc.nextDouble();
        savings.withdraw(withdrawAmount3);
        System.out.println("Savings balance: $" + savings.getBalance());

        sc.close();
    }
}