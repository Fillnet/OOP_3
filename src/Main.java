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
import Transport.Mechanic;
import java.util.List;
import Transport.Sponsor;
import Transport.ServiceStation;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        PassengerCar granta = new PassengerCar("Lada", "Granta", 1.9, BodyType.COUPE);
        granta.addDriver(new DriverB("Dur", "B", 14, granta));
        granta.addMechanic(new Mechanic<PassengerCar>("Batya", "Iveco"));
        granta.addSponsor(new Sponsor("King",25000));

        PassengerCar audi = new PassengerCar("Audi", "A8", 2.3, BodyType.SEDAN);
        PassengerCar bmw = new PassengerCar("BMW", "Z8", 3.2, BodyType.MINIVAN);
        PassengerCar kia = new PassengerCar("Kia", "Sportage", 2.0, BodyType.STATION_WAGON);

        Bus kamaz = new Bus("Камаз", "пассажирский", 4.0, Capacity.AVERAGE);
        kamaz.addDriver(new DriverD("Durilka", "D", 1, kamaz));
        kamaz.addMechanic(new Mechanic<PassengerCar>("Batya", "Samsung"));
        kamaz.addSponsor(new Sponsor("Boss",250000));

        Bus liaz = new Bus("Liaz", "K76", 3.5, Capacity.ESPECIALLY_SMALL);
        Bus karosa = new Bus("Karosa", "128756", 5.1, Capacity.AVERAGE);
        Bus pazik = new Bus("Paz", "Pazik", 2.3, Capacity.LARGE);

        Truck iveko = new Truck("Iveko", "IZ", 3.5, LiftingСapacity.N1);
        iveko.addDriver(new DriverC("Shaitan", "C", 11, iveko));
        iveko.addMechanic(new Mechanic<PassengerCar>("Batya", "Mars"));
        iveko.addSponsor(new Sponsor("Mars",100000));

        Truck ford = new Truck("Ford", "Transporter", 4.5, LiftingСapacity.N3);
        Truck tesla = new Truck("Tesla", "Myphic", 6.2, LiftingСapacity.N2);
        Truck zil = new Truck("Zil", "3151", 5.2, LiftingСapacity.N3);

        Driver vasya = new DriverB("VAsya", "B", 10, granta);
        Driver senna = new DriverC("Aaron Senna", "C", 25, tesla);
        Driver petryxa = new DriverD("Petryxa", "D", 5, pazik);

        List<Transport> transports = List.of(granta,
                kamaz,
                iveko);
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
        for (Transport transport : transports) {
            printListInfo(transport);
            ServiceStation<PassengerCar> corolko = new ServiceStation<PassengerCar>("Corolko");
            ServiceStation<Truck> michelin = new ServiceStation<Truck>("Michelin");
            corolko.addCarService(granta);
            corolko.addCarService(audi);
            corolko.addCarService(bmw);
            corolko.addCarService(kia);
            michelin.addCarService(iveko);
            michelin.addCarService(tesla);
            michelin.addCarService(zil);
            michelin.addCarService(ford);
            corolko.techInspection();
            michelin.techInspection();
        }
    }

    private static void printListInfo(Transport transport) {
        System.out.println("Информация по автомобилю " + transport.getBrand() + " " + transport.getModel());
        System.out.println("Водители: ");
        for (Driver<?> driver : transport.getDrivers()) {
            System.out.println(driver.getName());
        }System.out.println("Спонсоры : ");
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println(sponsor.getName()+" потратил на гонку "+sponsor.getAmount());
        }System.out.println("Механики: ");
        for (Mechanic<?> mechanic : transport.getMechanics()) {
            System.out.println(mechanic.getName()+" из компании "+mechanic.getCompany());
        }
    }
    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            if (!transport.diagnostic()) {
                try {
                    throw new RuntimeException("Автомобиль "
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
