package com.Homework08;

public class SavingsAccount extends BankAccount {
    private double rate = 0.01;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if(free_times <= 0) {
            super.deposit(amount - 1);
        }else {
            super.deposit(amount);
            free_times--;
        }
    }

    @Override
    public void withdraw(double amount) {
        if(free_times <= 0) {
            super.withdraw(amount + 1);
        }else {
            super.withdraw((amount));
            free_times--;
        }
    }

    //每月利息产生、操作手续费计次归零
    public void earnMonthlyInterest() {
        super.deposit(getBalance() * rate);
        free_times = 3;  //每月计次复位
    }
}
