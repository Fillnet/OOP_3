import Transport.Bus;
import Transport.Car;
import Transport.Cargo;
//import Transport.Train;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car("Lada", "Granta", 1.9);
        Car audi = new Car("Audi", "A8", 2.3);
        Car bmw = new Car("BMW", "Z8", 3.2);
        Car kia = new Car("Kia", "Sportage", 2.0);
        Bus kamaz = new Bus("Камаз", "пассажирский", 4.0);
        Bus liaz = new Bus("Liaz", "K76", 3.5);
        Bus karosa = new Bus("Karosa", "128756", 5.1);
        Bus pazik = new Bus("Paz", "Pazik", 2.3);
        Cargo iveko = new Cargo("Iveko", "IZ", 3.5);
        Cargo ford = new Cargo("Ford", "Transporter", 4.5);
        Cargo tesla = new Cargo("Tesla", "Myphic", 6.2);
        Cargo zil = new Cargo("Zil", "3151", 5.2);

//        Car hyundai = new Car(
//                "Hyundai",
//                "Avante",
//                2016);
//        Train lastochka = new Train("Ласточка",
//                "В-901",
//                2011,
//                "Russia",
//                "Белорусский вокзал",
//                "Минск-Пассажирский");
//        System.out.println();
//        printBusInfo(kamaz);
//        System.out.println();
//        printInfo(audi);
//        audi.getInsurance().checkExpireDate();
//        audi.getInsurance().checkNumber();
//        System.out.println(audi.isCorrectRegNumber());
//        System.out.println(audi);
//        System.out.println(kamaz);


    }

//    private static void printInfo(Car car) {
//        System.out.println(car.getBrand() +
//                "\n Марка автомобиля: " + car.getModel() +
//                "\n модель: " + car.getModel() +
//                "\n год выпуска: " + car.getProductionYear() +
//                "\n Страна выпуска: " + car.getProductionCountry() +
//                "\n цвет автомобиля: " + car.getColor() +
//                "\n объем двигателя: " + car.getEngineVolume() +
//                "\n коробка передач: " + car.getGears() +
//                "\n тип кузова: " + car.getTypeBody() +
//                "\n количество мест: " + car.getSeatCount() +
//                "\n рег.номер: " + car.getRegNumber() +
//                "\n шины: " + (car.isSummerTyres() ? "летняя" : "зимняя") + " резина" +
//                "\n доступ: " + (car.getKey().isWithoutKEyAcces() ? "без ключевой" : "ключевой") +
//                "\n запуск двигателя: " + (car.getKey().isRemoteRunEngine() ? "удаленный" : "обычный") +
//                "\n номер страховки: " + car.getInsurance().getNumber() +
//                "\n стоимость страховки: " + car.getInsurance().getCost() +
//                "\n срок действия страховки: " + car.getInsurance().getExpireDate() +
//                "\n максимальная скорость: " + car.getMaxSpeed()+
//                "\n Топливо: ");
//    }

//    private static void printTrainInfo(Train train) {
//        System.out.println("\n Поезд: " + train.getBrand() +
//                "\n Модель: " + train.getModel() +
//                "\n год выпуска: " + train.getProductionYear() +
//                "\n Страна производитель: " + train.getProductionCountry() +
//                "\n Скорость передвижения : " + train.getMaxSpeed() +
//                "\n Станция отправления: " + train.getDepartureStation() +
//                "\n Станция прибытия: " + train.getFinalStation() +
//                "\n Цена поездки: " + train.getPriceTrip() +
//                "\n количество вагонов: " + train.getQauantyWagons() +
//                "\n Время в пути: " + train.getTimeTrip());
//        train.refill();
//    }

//    private static void printBusInfo(Bus bus) {
//        System.out.println("\n Марка автобуса: " + bus.getBrand() +
//                "\n модель: " + bus.getModel() +
//                "\n год выпуска: " + bus.getProductionYear() +
//                "\n Страна выпуска: " + bus.getProductionCountry());
//        bus.refill();
//    }

}