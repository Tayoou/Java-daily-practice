package CollectionExercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author 樊峻成
 * @version 1.0
 */
public class CollectionExercise {
    public static void main(String[] args) {
        List dogs = new ArrayList();
        dogs.add(new Dog("小黄",1));
        dogs.add(new Dog("小黑",3));

        // 迭代器实现
//        Iterator ite = dogs.iterator();
//        while (ite.hasNext()) {
//            Object next =  ite.next();
//            System.out.println("dog =" + next);
//        }

        //增强for循环实现
        for (Object dog : dogs) {
            System.out.println("dog = " + dog);
        }

    }
}

class Dog {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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
}