package com.Parttern;
//说明：饿汉式单例模式无论是否调用，都会创建一个类对象，可能会浪费资源空间；
//    而懒汉式单例模式只有调用对应的静态方法时才会创建对象，节约资源空间，但可能会产生线程问题

public class Test {
    public static void main(String[] args) {
        Cat cat1 = Cat.getCat();
        Cat cat2 = Cat.getCat();
        System.out.println(cat1);
        System.out.println(cat2);

        Dog dog1 = Dog.getDog();
        Dog dog2 = Dog.getDog();
        System.out.println(dog1);
        System.out.println(dog2);
    }
}

//该类采用饿汉式单例模式
class Cat {
    //2.实例化一个对象
    private static Cat cat = new Cat();

    //1.私有化构造器
    private Cat() {
    }

    //3.构建static方法返回对象
    public static Cat getCat() {
        return cat;
    }
}

//该类采用懒汉式单例模式
class Dog {
    //2.定义一个空的static的Dog类属性
    private static Dog dog = null;

    //1.私有化构造器
    private Dog() {
    }

    //3.在static方法中判断属性并返回
    public static Dog getDog() {
        if(dog == null) {
            //4.在此将Dog对象实例化
            dog = new Dog();
            System.out.println("dog被调用");
        }
        return dog;
    }
}
