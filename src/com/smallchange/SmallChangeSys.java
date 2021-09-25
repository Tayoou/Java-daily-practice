package com.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean power = true;
        Scanner myScanner = new Scanner(System.in);
        String choose = "";
        String store = "";
        double money;
        double balance = 0;
        Date date = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        String details = "----------零钱通明细------------";

        do {
            System.out.println("\n-------------零钱通菜单-------------");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退        出");

            System.out.print("请选择(1-4)");
            choose = myScanner.next();

            switch (choose) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("入账金额：");
                    money = myScanner.nextDouble();

                    if(money <= 0) {
                        System.out.println("入账金额必须大于0！");
                        break;
                    }

                    date = new Date();
                    balance += money;
                    details += "\n收益入账 +" + money + " " + dateFormat.format(date) + " 余额:" + balance;
                    break;
                case "3":
                    System.out.println("消费名称：");
                    store = myScanner.next();
                    System.out.println("消费金额：");
                    money = myScanner.nextDouble();

                    if(money <= 0 || money > balance) {
                        System.out.println("消费金额应在0-" + balance);
                        break;
                    }

                    balance -= money;
                    details += "\n" + store + "   -" + money + " " + dateFormat.format(date) + " 余额:" + balance;
                    break;
                case "4":
                    String choice = "";
                    while(true) {
                        System.out.println("你确定要退出零钱通吗？(y/n)");
                        choice = myScanner.next();
                        if("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                    if("y".equals(choice)) {
                        power = false;
                        System.out.println("零钱通已退出！");
                    }
                    break;

                default:
                    System.out.println("请输入正确的选项");
            }
        }while(power);
    }
}
