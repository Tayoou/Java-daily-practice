package com.extend;

public class PC extends Computer{
    String brand;

    public PC(String CPU,int RAM,String Disk,String brand) {
        super(CPU,RAM,Disk);
        this.brand = brand;
    }
}
