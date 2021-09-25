package com.object_;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("小明",19,'男');
        Person person2 = new Person("小明",20,'男');
        System.out.println(person1.equals(person2));
    }
}
