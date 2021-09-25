package Paragraph10.Homework06;

/**
 * @author 樊峻成
 * @version 1.0
 */

public class factory {
    //Horse的创建设置为单例模式，只能使用一匹马
    private static Horse horse = new Horse();     //静态方法只能访问静态成员

    private factory() {}                          //私有化构造器

    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Plane getPlane() {
        return new Plane();
    }
}
