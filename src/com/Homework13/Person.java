package com.Homework13;

public class Person {
    private String name;
    private char tender;
    private int age;

    public Person(String name, char tender, int age) {
        this.name = name;
        this.tender = tender;
        this.age = age;
    }

    public void play() {
    }

    public void printInfo() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getTender() {
        return tender;
    }

    public void setTender(char tender) {
        this.tender = tender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
