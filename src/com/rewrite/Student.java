package com.rewrite;

public class Student extends Person{
    private String id;
    private double score;

    public Student() {
        super();
    }

    public Student(String name, int age, String id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say() {
        return super.say() + "id：" + id + "成绩：" + score;
    }
}
