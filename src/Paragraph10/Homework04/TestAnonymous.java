package Paragraph10.Homework04;

/**
 * @author 樊峻成
 * @version 1.0
 */

//考察匿名内部类使用
public class TestAnonymous {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },10,15);
    }
}
