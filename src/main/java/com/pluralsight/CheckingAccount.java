package com.pluralsight;

public class CheckingAccount implements BankAccount {
    private double balance;

    public CheckingAccount(double balance) {
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