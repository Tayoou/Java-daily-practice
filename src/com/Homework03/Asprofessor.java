package com.Homework03;

public class Asprofessor extends Teacher{
    @Override
    public String introduce() {
        return super.introduce() + getSalary();
    }

    public Asprofessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }
}
