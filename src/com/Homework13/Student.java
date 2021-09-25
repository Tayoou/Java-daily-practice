package com.Homework13;

public class Student extends Person{
    private String stu_id;

    public Student(String name, char tender, int age, String stu_id) {
        super(name, tender, age);
        this.stu_id = stu_id;
    }

    public void study() {
        System.out.println("我承诺，我会好好学习");
    }

    public void play() {
        System.out.println(getName() + "爱玩足球");
    }

    public void printInfo() {
        System.out.println("学生的信息:\n姓名：" + getName() + "\n年龄：" +
                getAge() + "\n性别：" + getTender() +"\n学号：" + stu_id);
        study();
        play();
    }
}
