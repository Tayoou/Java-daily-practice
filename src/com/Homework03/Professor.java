package com.Homework03;

public class Professor extends Teacher {
    @Override
    public String introduce() {
        return super.introduce() + getSalary();
    }

    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }
}
