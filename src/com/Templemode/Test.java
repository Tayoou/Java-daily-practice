package com.Templemode;

//本包采用了抽象模板模式，将时间统计作为了模板，将各类eat()方法作为抽象方法加入模板
public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.getTime();
        dog.getTime();
    }
}
