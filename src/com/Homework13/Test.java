package com.Homework13;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Person temp = null;
        Person[] p = new Person[4];
        p[0] = new Student("小明",'男',19,"0012345");
        p[1] = new Student("小张",'男',20,"0012484");
        p[2] = new Teacher("李贺",'男',31,5);
        p[3] = new Teacher("大聪明",'男',26,3);

        for (int i = 0; i < p.length; i++) {
            p[i].printInfo();
        }

        for (int i = 0; i < p.length; i++) {
            for (int j = i+1; j < p.length; j++) {
                if(p[i].getAge() < p[j].getAge()){
                    temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                }
            }
        }

        System.out.println("============修改后===============");
        for (int i = 0; i < p.length; i++) {
            p[i].printInfo();
        }
    }
}
