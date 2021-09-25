package com.Enum;

/**
 * @author 樊峻成
 * @version 1.0
 */
public class enumeration {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);

        System.out.println(Person.PERSON1);
        System.out.println(Person.PERSON2);
    }
}

//自定义类实现枚举
class Season {
    private String season;
    private String sensation;

    public static final Season SPRING = new Season("春天","清爽");
    public static final Season SUMMER = new Season("夏天","炎热");
    public static final Season AUTUMN = new Season("秋天","凉爽");
    public static final Season WINTER = new Season("冬天","寒冷");

    //1.构造器私有化
    //2.去掉setXxx方法，设置为只读类型
    //3.类中创建对象，加上static和final修饰符防止类加载
    private Season(String season, String sensation) {
        this.season = season;
        this.sensation = sensation;
    }

    public String getSeason() {
        return season;
    }


    public String getSensation() {
        return sensation;
    }

    @Override
    public String toString() {
        return "Season{" +
                "season='" + season + '\'' +
                ", sensation='" + sensation + '\'' +
                '}';
    }
}

//通过枚举关键字实现枚举
enum Person {
    PERSON1("Jack","帅"),PERSON2("Marry","美");
    private String name;
    private String appearance;

    Person(String name, String appearance) {
        this.name = name;
        this.appearance = appearance;
    }

    public String getName() {
        return name;
    }


    public String getAppearance() {
        return appearance;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", appearance='" + appearance + '\'' +
                '}';
    }
}