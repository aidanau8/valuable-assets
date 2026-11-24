package com.pluralsight;

public class SavingsAccount implements BankAccount {
    private double balance;
    private static double interestRate = 0.033;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public double withdraw(double amount) {
        balance -= amount;
        return amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double getValue() {
        return balance;
    }
}