import Driver.Driver;
import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Transport.Bus;
import Transport.PassengerCar;
import Transport.Truck;
import Transport.BodyType;
import Transport.LiftingСapacity;
import Transport.Capacity;
import Transport.Transport;


public class Main {
    public static void main(String[] args) {
        PassengerCar granta = new PassengerCar("Lada", "Granta", 1.9, BodyType.COUPE);
        PassengerCar audi = new PassengerCar("Audi", "A8", 2.3, BodyType.SEDAN);
        PassengerCar bmw = new PassengerCar("BMW", "Z8", 3.2, BodyType.MINIVAN);
        PassengerCar kia = new PassengerCar("Kia", "Sportage", 2.0, BodyType.STATION_WAGON);
        Bus kamaz = new Bus("Камаз", "пассажирский", 4.0, Capacity.AVERAGE);
        Bus liaz = new Bus("Liaz", "K76", 3.5, Capacity.ESPECIALLY_SMALL);
        Bus karosa = new Bus("Karosa", "128756", 5.1, Capacity.AVERAGE);
        Bus pazik = new Bus("Paz", "Pazik", 2.3, Capacity.LARGE);
        Truck iveko = new Truck("Iveko", "IZ", 3.5, LiftingСapacity.N1);
        Truck ford = new Truck("Ford", "Transporter", 4.5, LiftingСapacity.N3);
        Truck tesla = new Truck("Tesla", "Myphic", 6.2, LiftingСapacity.N2);
        Truck zil = new Truck("Zil", "3151", 5.2, LiftingСapacity.N3);
        Driver vasya = new DriverB("VAsya", "B", 10, granta);
        Driver senna = new DriverC("Aaron Senna", "C", 25, tesla);
        Driver petryxa = new DriverD("Petryxa", "D", 5, pazik);
        service(granta, audi, bmw, kia,
                kamaz, liaz, karosa, pazik,
                iveko, ford, tesla, zil);

        System.out.println(vasya);
        System.out.println(petryxa);
        System.out.println(senna);
        System.out.println();
        granta.startMoving();
        granta.pitStop();
        granta.maxSpeed();
        granta.bestTimeCircle();
        System.out.println();
        tesla.startMoving();
        tesla.pitStop();
        tesla.maxSpeed();
        tesla.bestTimeCircle();
        System.out.println();
        pazik.startMoving();
        pazik.pitStop();
        pazik.maxSpeed();
        pazik.bestTimeCircle();
        System.out.println();
        System.out.println();
        granta.printType();
        iveko.printType();
        pazik.printType();

    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            if (!transport.diagnostic()) {
                try {
                    throw new RuntimeException("\nАвтомобиль "
                            + transport.getBrand() + " "
                            + transport.getModel() +
                            " Не прошел диагностику");

                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
