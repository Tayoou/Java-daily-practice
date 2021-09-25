package Paragraph10.Homework07;

/**
 * @author 樊峻成
 * @version 1.0
 */
public class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("空调吹冷气");
            } else if (temperature < 0) {
                System.out.println("空调吹暖气");
            } else {
                System.out.println("空调关闭");
            }
        }
    }

    public Air getAir() {
        Air air = new Air();
        return air;
    }
}
