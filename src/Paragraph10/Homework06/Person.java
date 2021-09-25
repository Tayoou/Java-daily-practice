package Paragraph10.Homework06;

/**
 * @author 樊峻成
 * @version 1.0
 */
public class Person {
    private String name;
    private Vehicles vehicle;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        vehicle = vehicles;
    }

    public void Common() {
        if(!(vehicle instanceof Horse)) {       //判断初始交通工具是否符合当前情况
            vehicle = factory.getHorse();       //向上转型
        }
        vehicle.work();
    }

    public void River() {
        if(!(vehicle instanceof Boat)) {        //判断初始交通工具是否符合当前情况
            vehicle = factory.getBoat();        //向上转型
        }
        vehicle.work();
    }

    public void Fire() {
        if(!(vehicle instanceof Plane)) {
            vehicle = factory.getPlane();
        }
        vehicle.work();
    }
}
