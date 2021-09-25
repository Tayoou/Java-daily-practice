package com.Homework03;

public class NTeacher extends Teacher{
    @Override
    public String introduce() {
        return super.introduce() + getSalary();
    }

    public NTeacher(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }
}
