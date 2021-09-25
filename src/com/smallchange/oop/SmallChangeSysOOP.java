package com.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
    boolean power = true;
    Scanner myScanner = new Scanner(System.in);
    String choose = "";
    String store = "";
    double money;
    double balance = 0;
    Date date = null;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    String details = "----------零钱通明细------------";

    //主页面
    public void sysMenu() {
        System.out.println("\n-------------零钱通菜单(OOP)-------------");
        System.out.println("\t\t\t1 零钱通明细");
        System.out.println("\t\t\t2 收益入账");
        System.out.println("\t\t\t3 消费");
        System.out.println("\t\t\t4 退        出");

        System.out.print("请选择(1-4)");
        choose = myScanner.next();
    }

    //明细
    public void detailed() {
        System.out.println(details);
    }

    //入账
    public void entry() {
        System.out.println("入账金额：");
        money = myScanner.nextDouble();

        if (money <= 0) {
            System.out.println("入账金额必须大于0！");
            return;
        }

        date = new Date();
        balance += money;
        details += "\n收益入账 +" + money + " " + dateFormat.format(date) + " 余额:" + balance;
    }

    //消费
    public void consume() {
        System.out.println("消费名称：");
        store = myScanner.next();
        System.out.println("消费金额：");
        money = myScanner.nextDouble();

        if (money <= 0 || money > balance) {
            System.out.println("消费金额应在0-" + balance);
            return;
        }

        balance -= money;
        details += "\n" + store + "   -" + money + " " + dateFormat.format(date) + " 余额:" + balance;
    }

    //退出
    public void exit() {
        String choice = "";
        while (true) {
            System.out.println("你确定要退出零钱通吗？(y/n)");
            choice = myScanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        if ("y".equals(choice)) {
            power = false;
            System.out.println("零钱通已退出！");
        }
    }

    //执行
    public void exe() {
        do {
            sysMenu();

            switch (choose) {
                case "1":
                    detailed();
                    break;
                case "2":
                    entry();
                    break;
                case "3":
                    consume();
                    break;
                case "4":
                    exit();
                    break;
                default:
                    System.out.println("请输入正确的选项");
            }
        } while (power);
    }

}
