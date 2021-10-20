package HashSetExercise.Practice02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author 樊峻成
 * @version 1.0
 */
@SuppressWarnings("all")
public class Think {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("Jack","男",new MyDate(2002,10,3)));
        hashSet.add(new Employee("Mary","女",new MyDate(2010,1,30)));
        hashSet.add(new Employee("Jack","男",new MyDate(2002,10,3)));

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}

class Employee {
    private String name;
    private String sal;
    private MyDate birthday;

    public Employee(String name, String sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return  "姓名：'" + name + '\'' +
                "性别：'" + sal + '\'' +
                "生日: '" + birthday ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(sal, employee.sal) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sal, birthday);
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return  year +
                ":" + month +
                ":" + day ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}