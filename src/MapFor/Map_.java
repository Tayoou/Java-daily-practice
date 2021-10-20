package MapFor;

import java.util.*;

/**
 * 说明：使用三种方法对HashMap进行迭代操作，分别是Entry，Collection，Set
 * 下面分别对三种方法使用增强for和迭代器方法对HashMap进行遍历操作
 */
public class Map_ {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("sda8432s", "Jack");
        map.put("fad5684d", "Mary");
        map.put("jug5874c", "Tom");
        map.put("bng999hb", "Apple");
        map.put("jpg8754k", "Pear");
        map.put("jmn8546y", "Harry");

        //方法1：取出entry的键值放入set集合
        Set sets = map.keySet();
        //增强for
        for (Object set : sets) {
            System.out.println(set + "-" + map.get(set));
        }
        //迭代器
        Iterator set = sets.iterator();
        while (set.hasNext()) {
            Object next = set.next();
            System.out.println(next + "-" + map.get(next));
        }

        //方法2：取出entry的value值放入collection集合
        Collection values = map.values();
        //增强for
        for (Object value : values) {
            System.out.println(value);
        }
        //迭代器
        Iterator iterator = values.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        //方法3：使用entry向下转型调用map.entry下的两个方法
        Set entrySet = map.entrySet();
        //增强for
        for (Object o : entrySet) {
            Map.Entry mapEntry = (Map.Entry)o;     //向下转型，使用Map.Entry的方法
            System.out.println(mapEntry.getKey() + "-" + mapEntry.getValue());
        }
        //迭代器
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            Map.Entry oj = (Map.Entry)next;
            System.out.println(oj.getKey() + "-" + oj.getValue());
        }
    }
}
