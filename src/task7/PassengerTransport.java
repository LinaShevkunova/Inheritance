package task7;
/*
количество пассажиров
тип кузова
 */

import java.util.Scanner;

public class PassengerTransport extends LandTransport{

    int numOfPassengers;
    String bodyType;

    public PassengerTransport (int power, int maxSpeed, double weight, String carBrand, int wheelCount, int fuelConsumption, int numOfPassengers, String bodyType) {
        super(power, maxSpeed, weight, carBrand, wheelCount, fuelConsumption);
        this.numOfPassengers = numOfPassengers;
        this.bodyType = bodyType;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    private double fuelCons(double distance) {
        double consumption = this.fuelConsumption * distance / 100; //в литрах на сто километров
        return consumption;
    }

    public void calcConsumptionAndDistance() {
        System.out.println("Введите время поездки в часах");
        Scanner scanner = new Scanner(System.in);
        double time = scanner.nextInt();
        double distance = time * this.maxSpeed;
        double consumption = fuelCons(distance);
        System.out.println(String.format("За время %s ч автомобиль %s, двигаясь с максимальной скоростью %s км/ч, проедет %s км и израсходует %s л топлива",time, this.carBrand, this.maxSpeed, distance, consumption));

    }

    @Override
    public String toString() {
       return "PassengerTransport{" +
       "power=" + power +
               ", maxSpeed='" + maxSpeed + '\'' +
               ", weight='" + weight + '\'' +
               ", carBrand='" + carBrand + '\'' +
               ", wheelCount='" + wheelCount + '\'' +
               ", fuelConsumption='" + fuelConsumption + '\'' +
               ", numOfPassengers='" + numOfPassengers + '\'' +
               ", bodyType='" + bodyType + '\'' +
               ", kw='" + powerToKW() + '\'' +
               '}';
    }
}
