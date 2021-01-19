package task7;
/*
мощность двигателя (в лошадиных силах)
максимальная скорость (км/ч)
масса (в кг)
марка автомобиля
 */

public class Transport {

    int power;
    int maxSpeed;
    double weight;
    String carBrand;

    public Transport() {
    }

    public Transport (int power, int maxSpeed, double weight, String carBrand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.carBrand = carBrand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() { return maxSpeed; }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public double powerToKW () {
        double kw = this.power * 0.74;
        return kw;
    }


    @Override
    public String toString() {
        return "AirTransport{" +
                "power=" + power +
                ", maxSpeed='" + maxSpeed + '\'' +
                ", weight='" + weight + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", kw='" + powerToKW() + '\'' +
                '}';
    }
}
