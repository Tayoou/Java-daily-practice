package Paragraph10.Homework05;

/**
 * @author 樊峻成
 * @version 1.0
 */
public class A {
    private final String NAME = "FJC";
    public void hi(){
        class B{
            private final String NAME = "樊峻成";  //final 类型的变量在定义时需要初始化
            public void show() {
                System.out.println(NAME);
                System.out.println(A.this.NAME);
            }
        }
        B b = new B();
        b.show();
    }
}
