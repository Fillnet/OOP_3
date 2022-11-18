package Transport;


public class PassengerCar extends Transport implements Competing {
    private BodyType bodyType;
    public PassengerCar(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType=bodyType;
    }



    @Override
    public void startMoving() {
        System.out.printf("Автомобиль %s %s Стартует",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void stopMoving() {
        System.out.printf(" Автомобиль %s %s Останавливается",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по авто не достаточно ");
        } else {
            System.out.println("Автомобиль: "+getBrand()+" "+getModel()+" Тип кузова: " + getBodyType());
        }
    }

    @Override
    public boolean diagnostic() {
        return Math.random()>0.5;
    }

    @Override
    public void repair() {
        System.out.println("Машина "+getBrand()+" "+getModel()+" отремонтирована");
    }

    @Override
    public void pitStop() {
        System.out.printf(" Автомобиль %s %s заезжал на пит-стоп 3 раза ",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void bestTimeCircle() {
                System.out.printf(" Автомобиль %s %s проехал круг за 15 секунд",
                        this.getBrand(),
                        this.getModel());
    }

    @Override
    public void maxSpeed() {
                System.out.printf(" Автомобиль %s %s двигался с максимальной скоростью 250 км/ч",
                        this.getBrand(),
                        this.getModel());
    }
    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}
