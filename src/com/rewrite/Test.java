package com.rewrite;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("嫩叠",40);
        Student student = new Student("樊峻成",20,"2019212773",100);
        System.out.println(person.say());
        System.out.println("==================");
        System.out.println(student.say());;
    }
}
