package com.AbstractExercise01;

public class CommonEmployee extends Employee {

    public CommonEmployee(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工" + getName() + "工作中...." + "工资为：" + getSalary());
    }

}
