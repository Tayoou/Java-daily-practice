package com.Homework13;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, char tender, int age, int work_age) {
        super(name, tender, age);
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println("我承诺，我会认真教学");
    }

    public void play() {
        System.out.println(getName() + "爱玩象棋");
    }

    public void printInfo() {
        System.out.println("老师的信息:\n姓名：" + getName() + "\n年龄：" +
                getAge() + "\n性别：" + getTender() +"\n工龄：" + work_age);
        teach();
        play();
    }
}
