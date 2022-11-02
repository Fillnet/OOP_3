import Transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car granta = new Car(
                null,
                null,
                0,
                null,
                0,
                null,
                null,
                null);
        Car audi = new Car(
                "Audi",
                "A8",
                3.0,
                "Black",
                2020,
                "Germany",
                null,
                null);
        audi.setRegNumber("в431оe199");
        audi.setKey(new Car.Key(true,true));
        audi.setSummerTyres(false);
        audi.setInsurance(new Car.Insurance(LocalDate.now(),30000,"13345687"));
        Car bmw = new Car(
                "BMW",
                "Z8",
                3.0,
                "Black",
                2021,
                "Germany",
                null,
                null);
        Car kia = new Car(
                "Kia",
                "Sportage",
                2.4,
                "Red",
                2018,
                "Korea",
                null,
                null);
        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "Orange",
                2016,
                "Korea",
                null,
                null);
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
                "\n запуск двигателя: " + (car.getKey().isRemoteRunEngine() ? "удаленный" : "обычный")+
                "\n номер страховки: "+car.getInsurance().getNumber()+
                "\n стоимость страховки: "+car.getInsurance().getCost()+
                "\n срок действия страховки: "+car.getInsurance().getExpireDate());
    }
}