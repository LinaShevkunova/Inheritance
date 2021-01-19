package task7;
/*
количество пассажиров
наличие бизнес-класса
 */

import java.util.Scanner;

public class CivilTransport extends AirTransport{

    int numOfPassengers;
    Boolean businessClass;

    public CivilTransport(int power, int maxSpeed, double weight, String carBrand, int wingspan, int minimumRunwayLength, Boolean businessClass, int numOfPassengers) {
        super(power, maxSpeed, weight, carBrand, wingspan, minimumRunwayLength);
        this.numOfPassengers = numOfPassengers;
        this.businessClass = businessClass;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public Boolean getBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(Boolean businessClass) {
        this.businessClass = businessClass;
    }

    public void capacity() {
        System.out.println("Введите количество пассажиров для пасадки");
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        if (people > this.numOfPassengers ) {
            System.out.println("Вам нужен самолет побольше");
        } else {
            System.out.println("Самолет загружен.");
        }
    }


    @Override
    public String toString() {
        return "CivilTransport{" +
                "power=" + power +
                ", maxSpeed='" + maxSpeed + '\'' +
                ", weight='" + weight + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", wingspan='" + wingspan + '\'' +
                ", minimumRunwayLength='" + minimumRunwayLength + '\'' +
                ", numOfPassengers='" + numOfPassengers + '\'' +
                ", businessClass='" + businessClass + '\'' +
                ", kw='" + powerToKW() + '\'' +
                '}';
    }
}
