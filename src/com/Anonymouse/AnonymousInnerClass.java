package com.Anonymouse;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
        Outer04 outer01 = new Outer04();
        outer01.method();
    }
}

interface IA {
    void cry();
}

class Outer04 {
    private int n1 = 10;
    public void method() {
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("小老虎嗷嗷嗷....");
            }
        };
        tiger.cry();
        System.out.println(tiger);
    }
}
