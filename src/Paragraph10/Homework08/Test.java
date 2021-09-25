package Paragraph10.Homework08;

/**
 * @author 樊峻成
 * @version 1.0
 */

/*
使用枚举类来实现接口，并且利用了匿名内部类来重写接口方法
 */
public class Test {
    public static void main(String[] args) {
        Color01.showColor(new Show() {
            @Override
            public void show(String color) {
                Color01 mycolor = Color01.valueOf(color);
                Color01[] colors = Color01.values();
                for(Color01 onlycolor : colors) {
                    if(onlycolor == mycolor){
                        System.out.println(onlycolor);
                    }
                }
            }
        },"RED");
    }
}
