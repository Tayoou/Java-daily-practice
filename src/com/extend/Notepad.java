package com.extend;

public class Notepad extends Computer{
    String color;

    public Notepad(String CPU,int RAM,String Disk,String color){
        super(CPU,RAM,Disk);
        this.color = color;
    }
}
