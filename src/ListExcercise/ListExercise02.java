package ListExcercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 樊峻成
 * @version 1.0
 */
@SuppressWarnings("all")
public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("Java从入门到放弃", 130.2, "樊峻成"));
        list.add(new Book("Java核心卷", 98, "赵永进"));
        list.add(new Book("Python狗都不学", 50, "苏童"));

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        Book.sort(list);

        System.out.println("=============变化后=============");

        for (Object o : list) {
            System.out.println(o);
        }

    }
}

class Book {
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }

    public static void sort(List list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i; j < size - 1; j++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
