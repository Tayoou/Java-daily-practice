package Pr9Homework.Homework01;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 樊峻成
 * @version 1.0
 */
@SuppressWarnings("all")
public class Homework01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new News("新闻一：新冠确诊病例超千万，数百万印度教信徒赴恒河“圣浴”引民众担忧"));
        list.add(new News("新闻二：男子突然想起2个月前钓的鱼还在鱼兜里，捞起来一看赶紧放生"));

        Collections.reverse(list);
        int size = list.size();
        for (int i = size - 1; i >= 0; i--) {
            News o = (News) list.get(i);
            System.out.println(o.processTitle(o.getTitle()));
        }

    }
}

class News {
    private String title;
    private int attribute;

    public News(String title) {
        this.title = title;
    }

    public String processTitle(String title) {

        if (title == null) {
            return "";
        }

        if (title.length() > 15) {
            return title.substring(0, 15) + "...";
        } else {
            return title;
        }
    }

    @Override
    public String toString() {
        return "title=" + title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAttribute() {
        return attribute;
    }

    public void setAttribute(int attribute) {
        this.attribute = attribute;
    }

}
