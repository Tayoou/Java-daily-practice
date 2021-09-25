package Paragraph10.Homework08;

import java.awt.*;

/**
 * @author 樊峻成
 * @version 1.0
 */
enum Color01{
    RED(255,0,0),BLUE(0,0,255),
    BLACK(0,0,0),YELLOW(255,255,0),
    GREEN(0,255,0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    private Color01(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    public static void showColor(Show show, String color) {
        show.show(color);
    }

    @Override
    public String toString() {
        return  this.name() + "\t" +
                "redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue +
                '}';
    }
}

interface Show {
    void show(String color);
}
