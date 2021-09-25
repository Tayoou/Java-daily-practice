package com.AbstractExercise01;

public class Test {
    public static void main(String[] args) {
        CommonEmployee jack = new CommonEmployee("Jack", "2051654", 3000);
        Manager manager = new Manager("樊峻成", "2012773", 30000,20000);
        jack.work();
        manager.work();

    }
}
