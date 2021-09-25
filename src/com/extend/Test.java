package com.extend;

public class Test {
    public static void main(String[] args) {
        PC pc = new PC("Inter i7",16,"West Disk","msi");
        Notepad notepad = new Notepad("Inter i5",8,"SAMSONG","pink");
        pc.getDetails();
        System.out.println("品牌：" + pc.brand);
        System.out.println("=====================");
        notepad.getDetails();
        System.out.println("颜色：" + notepad.color);
    }
}
