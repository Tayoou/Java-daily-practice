package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 樊峻成
 * @version 1.0
 */
public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String) o2);
            }
        });
        treeSet.add("a");
        treeSet.add("d");
        treeSet.add("c");
        treeSet.add("b");

        System.out.println(treeSet);
    }
}
