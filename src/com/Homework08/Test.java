package com.Homework08;

public class Test {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(1000);
        account.deposit(200);
        account.deposit(200);
        account.withdraw(200);
        System.out.println(account.getBalance());
        account.deposit(200);
        System.out.println(account.getBalance());
        account.earnMonthlyInterest();
        System.out.println(account.getBalance());
        account.deposit(200);
        account.deposit(200);
        System.out.println(account.getBalance());
    }
}
