package MapFor.MapExercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 樊峻成
 * @version 1.0
 */
public class MapExercise {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(1, new Emp("Jack", 21000, 112));
        map.put(2, new Emp("Mary", 17000, 115));
        map.put(3, new Emp("Tom", 8000, 122));
        map.put(4, new Emp("Harry", 30000, 132));
        map.put(5, new Emp("Jerry", 3000, 179));

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            Map.Entry mapEntry = (Map.Entry) next;
            Emp emp = (Emp) mapEntry.getValue();
            if(emp.getSal() >= 18000) {
                System.out.println(emp.toString());
            }
        }
    }
}

class Emp {
    private String name;
    private double sal;
    private int id;

    public Emp(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}