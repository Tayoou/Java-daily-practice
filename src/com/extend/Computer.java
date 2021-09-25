package com.extend;

public class Computer {
    String CPU;
    int RAM;
    String Disk;

    public Computer(String CPU,int RAM,String Disk) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.Disk = Disk;
    }

    public void getDetails() {
        System.out.println("CPU型号：" + CPU + "\n内存大小：" + RAM + "\n硬盘型号：" + Disk);
    }
}
