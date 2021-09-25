package com.Templemode;

abstract public class Animal {
    public abstract void eat();

    public void getTime() {
        long start = System.currentTimeMillis();
        eat();
        long end = System.currentTimeMillis();
        System.out.println("Time:" + (end - start));
    }
}
