package ArrayExercise;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

/**
 * @author 樊峻成
 * @version 1.0
 */
public class ArrayTest {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦",20);
        books[1] = new Book("金瓶梅新",90);
        books[2] = new Book("青年文摘20年",5);
        books[3] = new Book("java从入门到放弃",300);

        System.out.println(Arrays.toString(books));
        System.out.println("Please select the sorting method: 1. Sort by price 2. Sort by name");
        int choose = myScanner.nextInt();

        if(choose == 1) {
            Arrays.sort(books, new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {
                    Integer i1 = (Integer) o1.getPrice();
                    Integer i2 = (Integer) o2.getPrice();
                    return i1 - i2;
                }
            });
        }else {
            Arrays.sort(books, new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {
                    int i1 = o1.getName().length();
                    int i2 = o2.getName().length();
                    return i1 - i2;
                }
            });
        }
        System.out.println(Arrays.toString(books));
    }
}
