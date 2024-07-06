package org.example;

import java.util.Scanner;

public class FinanceTracker {
    private double balance;

    public FinanceTracker(){
        balance = 0.0;
    }

    public void addIncome (double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Income added: " + amount);
        } else {
            System.out.println("Invalid amount. Please enter positive number");
        }
    }

    public void addExpence (double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("Expense added: " + amount);
        } else {
            System.out.println("Expense amount is incorrect. Pls enter positive number");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printBalance () {
        System.out.println("Current balance: " + balance);
    }
}
