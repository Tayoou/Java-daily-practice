package com.poly_.polyparameter_;

public class Test {
    public void showEmpAnnual(Employee e) {
        System.out.println(e.getName() + "的年工资为：" + e.getAnnual());
    }

    public void testWork(Employee e) {
        if(e instanceof Worker) {
            ((Worker) e).work();
        }else{
            ((Manager) e).manage();
            "abc".equals("123456");
        }
    }
}
