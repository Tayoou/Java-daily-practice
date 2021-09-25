package com.Templemode;

public class Dog extends Animal{
    @Override
    public void eat() {
        long sum = 0;
        for (int i = 1; i < 160000; i++) {
            sum *= i;
        }
    }
}
