package frequentclass.homework04;

/**
 * @author 樊峻成
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        String str = "AbcDefG";
        int res = Judge.numJudge(str);
        System.out.println("大写字母为: " + res + "小写字母为:" + (str.length()-res));
    }
}

class Judge {
    public static int numJudge(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < 'a') {
                sum++;
            }
        }
        return sum;
    }
}
