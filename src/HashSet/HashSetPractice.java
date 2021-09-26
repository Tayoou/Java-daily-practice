package HashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 樊峻成
 * @version 1.0
 */
public class HashSetPractice {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new String("你好"));
        hashSet.add(1);
        hashSet.add(null);

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
