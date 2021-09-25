package com.Homework04;

public class Worker extends Employee{
    public Worker(String name, double salary_day, int days, double grade) {
        super(name, salary_day, days, grade);
    }

    @Override
    public String showSalary() {
        return super.showSalary() + getSalary_day()*getDays()*getGrade();
    }
}
