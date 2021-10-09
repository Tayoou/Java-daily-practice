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
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
