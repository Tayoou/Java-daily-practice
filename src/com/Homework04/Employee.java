package com.Homework04;

public class Employee {
    private String name;
    private double salary_day;
    private int days;
    private double grade;

    public Employee(String name, double salary_day, int days, double grade) {
        this.name = name;
        this.salary_day = salary_day;
        this.days = days;
        this.grade = grade;
    }

    public String showSalary() {
        return "员工" + name + "的工资为：";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary_day() {
        return salary_day;
    }

    public void setSalary_day(double salary_day) {
        this.salary_day = salary_day;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
