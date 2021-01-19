package task7;
/*
количество колес
расход топлива (литров на 100 км)
 */

public class LandTransport extends Transport {

    int wheelCount;
    int fuelConsumption;

    public LandTransport(int power, int maxSpeed, double weight, String carBrand, int wheelCount, int fuelConsumption) {
        super(power, maxSpeed, weight, carBrand);
        this.wheelCount = wheelCount;
        this.fuelConsumption = fuelConsumption;
    }

    public int getWheelCount(){
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "AirTransport{" +
                "power=" + power +
                ", maxSpeed='" + maxSpeed + '\'' +
                ", weight='" + weight + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", wheelCount='" + wheelCount + '\'' +
                ", fuelConsumption='" + fuelConsumption + '\'' +
                ", kw='" + powerToKW() + '\'' +
                '}';
    }
}
