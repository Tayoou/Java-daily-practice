package Expection;

import java.util.Scanner;

/**
 * @author 樊峻成
 * @version 1.0
 */

//使用异常实现让用户输入整数，如果输入的不是整数，将反复输入
public class TryCatchExercise04 {
    public static void main(String[] args) {
        int flag = 1;
        do {
            flag = integer_.integerTest();
        }while (flag == 1);
    }
}

class integer_ {
    public static int integerTest() {
        try {
            System.out.println("请输入一个整数:");
            Scanner myScanner = new Scanner(System.in);
            int a = myScanner.nextInt();
            return 0;
        } catch (Exception e) {
            return 1;
        }
    }
}
