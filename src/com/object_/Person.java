package com.object_;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public boolean equals(Object obj) {
        Person pbj = (Person) obj;
        if (obj instanceof Person) {
            if (name.equals(pbj.name) == false) {
                return false;
            } else if (age != pbj.age) {
                return false;
            } else if (gender != pbj.gender) {
                return false;
            } else {
                return true;
            }
        }else{
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

