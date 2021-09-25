package com.Enum.Week;

/**
 * @author 樊峻成
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        for(Week week : weeks) {
            System.out.println(week);
        }
    }
}

enum Week {
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),
    THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),
    SUNDAY("星期天");

    private String definition;

    Week(String definition) {
        this.definition = definition;
    }

    @Override
    public String toString() {
        return definition;
    }
}