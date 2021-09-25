package frequentclass.homework01;

import java.util.Arrays;

/**
 * @author 樊峻成
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        try {
            String str = "123456789";
            String result = TurnStrings.reverse(str,2,6);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("更改失败！");
        }
    }
}

class TurnStrings {
    public static String reverse(String str, int start, int end) {
        if (!(start <= end && start > 0 && end > 0)) {
            throw new RuntimeException("参数错误");
        }
        char[] a = str.toCharArray();
        char temp;
        for (; start < end; start++,end--) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
        }
        return (new String(a));
    }
}
