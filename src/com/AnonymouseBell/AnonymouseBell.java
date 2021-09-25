package com.AnonymouseBell;

public class AnonymouseBell {
    public static void main(String[] args) {
        Cellphone p = new Cellphone();
        p.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪，起床了");
            }
        });
        p.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}

class Cellphone {
    public void alarmclock(Bell bell) {
        bell.ring();
    }
}

interface Bell {
    void ring();
}