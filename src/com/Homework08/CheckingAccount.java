package com.Homework08;

public class CheckingAccount extends BankAccount {

    //存款
    @Override
    public void deposit(double amount) {
        if (free_times <= 0) {
            free_times = 0;
            setBalance(getBalance() + amount - 1);
            System.out.println("存入：" + amount + "扣除手续费1元\t" + "当前余额：" + getBalance());
        } else {
            setBalance(getBalance() + amount);
            System.out.println("存入：" + amount + "本次操作免手续费\t" + "当前余额：" + getBalance());
            free_times--;
        }
        System.out.println("本月免手续费次数：" + free_times);
    }

    //取款
    @Override
    public void withdraw(double amount) {
        if (free_times <= 0) {
            free_times = 0;
            setBalance(getBalance() - amount - 1);
            System.out.println("取出：" + amount + "扣除手续费1元\t" + "当前余额：" + getBalance());
        } else {
            setBalance(getBalance() - amount);
            System.out.println("取出：" + amount + "本次操作免手续费\t" + "当前余额：" + getBalance());
            free_times--;
        }
        System.out.println("本月免手续费次数：" + free_times);
    }

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }
}
