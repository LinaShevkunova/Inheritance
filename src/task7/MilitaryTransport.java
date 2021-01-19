package task7;
/*
наличие системы катапультирования
количество ракет на борту
 */

public class MilitaryTransport extends AirTransport{

    Boolean ejectionSystem;
    int numOfmissiles;

    public MilitaryTransport (int power, int maxSpeed, double weight, String carBrand, int wingspan, int minimumRunwayLength, Boolean ejectionSystem, int numOfmissiles) {
        super(power, maxSpeed, weight, carBrand, wingspan, minimumRunwayLength);
        this.ejectionSystem = ejectionSystem;
        this.numOfmissiles = numOfmissiles;
    }

    public Boolean getEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(Boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    public int getNumOfmissiles() {
        return numOfmissiles;
    }

    public void setNumOfmissiles(int numOfmissiles) {
        this.numOfmissiles = numOfmissiles;
    }

    public void shot() {
        if (this.numOfmissiles != 0) {
            System.out.println("Ракета прошла...");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void catapulta() {
        if (this.ejectionSystem = true) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

    @Override
    public String toString() {
        return "MilitaryTransport{" +
                "power=" + power +
                ", maxSpeed='" + maxSpeed + '\'' +
                ", weight='" + weight + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", wingspan='" + wingspan + '\'' +
                ", minimumRunwayLength='" + minimumRunwayLength + '\'' +
                ", ejectionSystem='" + ejectionSystem + '\'' +
                ", numOfmissiles='" + numOfmissiles + '\'' +
                ", kw='" + powerToKW() + '\'' +
                '}';
    }
}
