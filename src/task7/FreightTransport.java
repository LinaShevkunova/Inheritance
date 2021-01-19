package task7;
 /*
 грузоподъемность (в тоннах)
  */

import java.util.Scanner;

public class FreightTransport extends LandTransport{

    int liftingCapacity;

    public FreightTransport (int power, int maxSpeed, double weight, String carBrand, int wheelCount, int fuelConsumption, int liftingCapacity) {
        super(power, maxSpeed, weight, carBrand, wheelCount, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    public void overload() {
        System.out.println("Введите размер груза для погрузки в машину (в тоннах)");
        Scanner scanner = new Scanner(System.in);
        int cargo = scanner.nextInt();
        if (cargo > this.liftingCapacity ) {
            System.out.println("Вам нужен грузовик побольше");
        } else {
            System.out.println("Грузовик загружен.");
        }
    }

    @Override
    public String toString() {
        return "FreightTransport{" +
                "power=" + power +
                ", maxSpeed='" + maxSpeed + '\'' +
                ", weight='" + weight + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", wheelCount='" + wheelCount + '\'' +
                ", fuelConsumption='" + fuelConsumption + '\'' +
                ", liftingCapacity='" + liftingCapacity + '\'' +
                ", kw='" + powerToKW() + '\'' +
                '}';
    }
}
