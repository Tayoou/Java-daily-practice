package com.Homework04;

public class Test {
    public static void main(String[] args) {
        Manager jack = new Manager("Jack", 10000, 30, 1.2);
        Worker marry = new Worker("Marry", 10000, 25, 1.0);
        System.out.println(jack.showSalary());;
        System.out.println(marry.showSalary());;

    }
}
