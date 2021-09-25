package com.Templemode;

public class Cat extends Animal{
    @Override
    public void eat() {
        long sum = 0;
        for (int i = 1; i < 80000; i++) {
            sum += i;
        }
    }
}
