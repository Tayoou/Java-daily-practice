package Expection.Homework01;

import java.util.Scanner;

/**
 * @author 樊峻成
 * @version 1.0
 */
public class EcmDef {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数异常");
            }

            Integer x = Integer.parseInt(args[0]);
            Integer y = Integer.parseInt(args[1]);

            System.out.println(calculate.cal(x,y));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

class calculate {
    public static double cal(int n1,int n2) {
        return n1 / n2;
    }
}
