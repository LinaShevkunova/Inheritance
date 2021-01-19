package task7;

public class Main {

    public static void main(String[] args) {

        PassengerTransport car = new PassengerTransport(200, 250, 2, "Audi", 4, 12, 5, "sedan");

        System.out.println(car.toString());
        car.calcConsumptionAndDistance();

        System.out.println("____________________");

        FreightTransport truck = new FreightTransport(120, 200, 5, "man", 4, 12, 10);
        System.out.println(truck.toString());
        truck.overload();

        System.out.println("_____________________");

        MilitaryTransport van = new MilitaryTransport(120, 250, 3.5, "general", 234,653, false, 5);
        System.out.println(van.toString());
        van.shot();
        van.catapulta();

        System.out.println("_____________________");

        CivilTransport boeing = new CivilTransport(800, 850, 79, "boeing 737—800",  234, 160, true, 169);
        System.out.println(boeing.toString());
        boeing.capacity();
    }
}