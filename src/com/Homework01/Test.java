package com.Homework01;

public class Test {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        Person temp = null;

        person[0] = new Person("小明",19,"学生");
        person[1] = new Person("小红",20,"空姐");
        person[2] = new Person("小姜",30,"程序员");

        for (int i = 0; i < person.length; i++) {
            for (int j = i; j < person.length; j++) {
                if(person[i].getAge() < person[j].getAge()) {
                    temp = person[i];
                    person[i] = person[j];
                    person[j] = temp;
                }
            }
        }

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }
}
