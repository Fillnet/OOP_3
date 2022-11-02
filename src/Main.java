import Transport.Bus;
import Transport.Car;
import Transport.tarin;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car(
                null,
                null,
                0,
                null);
        Car audi = new Car(
                "Audi",
                "A8",
                0,
                null);
        audi.setRegNumber("в431оe199");
        audi.setKey(new Car.Key(true, true));
        audi.setSummerTyres(false);
        audi.setInsurance(new Car.Insurance(LocalDate.now(), 30000, "13345687"));
        Car bmw = new Car(
                "BMW",
                "Z8",
                2021,
                "Germany");
        Car kia = new Car(
                "Kia",
                "Sportage",
                2018,
                "Korea");
        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                2016,
                "Korea");
        tarin lastochka = new tarin("Ласточка",
                "В-901",
                2011,
                "Russia",
                "Белорусский вокзал",
                "Минск-Пассажирский");
        Bus kamaz = new Bus("Камаз", "пассажирский", 2022, "Russia");
        lastochka.setPriceTrip(3500);
        lastochka.setQauantyWagons(11);
        lastochka.setMaxSpeed(301);
        lastochka.setTimeTrip(12.36);
        printTrainInfo(lastochka);
        System.out.println();
        printBusInfo(kamaz);
        System.out.println();
        printInfo(audi);
        audi.getInsurance().checkExpireDate();
        audi.getInsurance().checkNumber();
        System.out.println(audi.isCorrectRegNumber());


    }

    private static void printInfo(Car car) {
        System.out.println(car.getBrand() +
                "\n Марка автомобиля: " + car.getModel() +
                "\n модель: " + car.getModel() +
                "\n год выпуска: " + car.getProductionYear() +
                "\n Страна выпуска: " + car.getProductionCountry() +
                "\n цвет автомобиля: " + car.getColor() +
                "\n объем двигателя: " + car.getEngineVolume() +
                "\n коробка передач: " + car.getGears() +
                "\n тип кузова: " + car.getTypeBody() +
                "\n количество мест: " + car.getSeatCount() +
                "\n рег.номер: " + car.getRegNumber() +
                "\n шины: " + (car.isSummerTyres() ? "летняя" : "зимняя") + " резина" +
                "\n доступ: " + (car.getKey().isWithoutKEyAcces() ? "без ключевой" : "ключевой") +
                "\n запуск двигателя: " + (car.getKey().isRemoteRunEngine() ? "удаленный" : "обычный") +
                "\n номер страховки: " + car.getInsurance().getNumber() +
                "\n стоимость страховки: " + car.getInsurance().getCost() +
                "\n срок действия страховки: " + car.getInsurance().getExpireDate() +
                "\n максимальная скорость: " + car.getMaxSpeed());
    }

    private static void printTrainInfo(tarin tarin) {
        System.out.println("\n Поезд: " + tarin.getBrand() +
                "\n Модель: " + tarin.getModel() +
                "\n год выпуска: " + tarin.getProductionYear() +
                "\n Страна производитель: " + tarin.getProductionCountry() +
                "\n Скорость передвижения : " + tarin.getMaxSpeed() +
                "\n Станция отправления: " + tarin.getDepartureStation() +
                "\n Станция прибытия: " + tarin.getFinalStation() +
                "\n Цена поездки: " + tarin.getPriceTrip() +
                "\n количество вагонов: " + tarin.getQauantyWagons() +
                "\n Время в пути: " + tarin.getTimeTrip());
    }

    private static void printBusInfo(Bus bus) {
        System.out.println("\n Марка автобуса: " + bus.getBrand() +
                "\n модель: " + bus.getModel() +
                "\n год выпуска: " + bus.getProductionYear() +
                "\n Страна выпуска: " + bus.getProductionCountry());
    }
}