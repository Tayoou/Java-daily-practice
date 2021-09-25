package com.encap;

public class encapsulation {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("樊峻成");
        account.setMoney(895421.25);
        account.setPassword("123456");
        account.showInf();
        Account account1 = new Account("樊",895421.25,"123456");
        account1.showInf();

    }
}

class Account {
    String name;
    double money;
    String password;

    public Account() {
    }

    public Account(String name, double money, String password) {
        this.setName(name);
        this.setMoney(money);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else{
            System.out.println("名字长度不符，请输入2到4个长度字符串");
            this.name = "无效姓名";
        }
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if(money > 20) {
            this.money = money;
        }else{
            System.out.println("请输入大于20的余额");
            this.money = 20;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() == 6) {
            this.password = password;
        }else{
            System.out.println("请输入6位密码");
            this.password = "000000";
        }
    }

    public void showInf() {
        System.out.println("姓名：" + name + "\t存款：" + money + "\t密码：" + password);
    }
}
