package task7;
/*
размах крыльев (в метрах)
минимальная длина взлетно-посадочной полосы
 */

public class AirTransport extends Transport{

    int wingspan;
    int minimumRunwayLength;

    public AirTransport(int power, int maxSpeed, double weight, String carBrand, int wingspan, int minimumRunwayLength) {
        super(power, maxSpeed, weight, carBrand);
        this.wingspan = wingspan;
        this.minimumRunwayLength = minimumRunwayLength;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinimumRunwayLength() {
        return minimumRunwayLength;
    }

    public void setMinimumRunwayLength(int minimumRunwayLength) {
        this.minimumRunwayLength = minimumRunwayLength;
    }

    @Override
    public String toString() {
        return "AirTransport{" +
                "power=" + power +
                ", maxSpeed='" + maxSpeed + '\'' +
                ", weight='" + weight + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", wingspan='" + wingspan + '\'' +
                ", minimumRunwayLength='" + minimumRunwayLength + '\'' +
                ", kw='" + powerToKW() + '\'' +
                '}';
    }
}

