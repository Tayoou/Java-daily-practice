package com.Homework10;

public class Test {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("小张", 20, "学生", '男', 10000);
        Doctor doctor2 = new Doctor("小张", 20, "学生", '男', 10000);
        System.out.println(doctor1.equals(doctor2));
    }
}
