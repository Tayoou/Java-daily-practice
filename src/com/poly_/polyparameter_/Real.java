package com.poly_.polyparameter_;

public class Real {
    public static void main(String[] args) {
        Test test = new Test();
        Employee[] emp = new Employee[4];
        emp[0] = new Manager("樊峻成",30000,12589.25);
        emp[1] = new Worker("小明",12000);
        emp[2] = new Worker("小张",11000);
        emp[3] = new Worker("小鸿",22000);

        for (int i = 0; i < emp.length; i++) {
            test.showEmpAnnual(emp[i]);
            test.testWork(emp[i]);
        }
    }
}
