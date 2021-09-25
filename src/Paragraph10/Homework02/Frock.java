package Paragraph10.Homework02;

/**
 * @author 樊峻成
 * @version 1.0
 */
public class Frock {
    private static int currentNum = 100000;    //序列号起始值
    private int serialNumber;

    public Frock() {
        serialNumber = getNextNum();
    }

    //获取序列号方法
    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

}
