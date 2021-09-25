package com.Homework11;

public class Test {
    public static void main(String[] args) {
        //向上转型不可访问运行类型的特有方法
        Person p = new Student();
        p.eat();
        p.run();
        //向下转型之后可以访问运行类型方法（此时运行类型等于编译类型）
        Student s = (Student) p;
        s.eat();
        s.study();
        s.run();

    }
}
