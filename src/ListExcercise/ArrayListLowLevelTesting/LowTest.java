package ListExcercise.ArrayListLowLevelTesting;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @author 樊峻成
 * @version 1.0
 */
public class LowTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        arrayList.add(100);
        arrayList.add(200);

        Vector vector = new Vector(3);
        vector.add(100);
        vector.add(200);
        vector.add(300);
        vector.add(400);

    }
}
