package Transport;


public class Truck extends Transport implements Competing {
    private LiftingСapacity liftingСapacity;

    public Truck(String brand, String model, double engineVolume, LiftingСapacity liftingСapacity) {
        super(brand, model, engineVolume);
        this.liftingСapacity = liftingСapacity;
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
        if (liftingСapacity == null) {
            System.out.println("Данных по авто не достаточно ");
        } else {
            String from = liftingСapacity.getFrom() == null ? "" : " от " + liftingСapacity.getFrom();
            String to = liftingСapacity.getTo() == null ? "" : " до " + liftingСapacity.getTo();
            System.out.println("Грузовик: "+getBrand()+" "+getModel()+" Класс грузоподъемности: " + getLiftingСapacity() + " " + from+"т" + to+"т");
        }
    }

    @Override
    public boolean diagnostic() {
        return Math.random()>0.75;
    }

    @Override
    public void repair() {
        System.out.println("Грузовик "+getBrand()+" "+getModel()+" отремонтирована");
    }

    @Override
    public void pitStop() {
        System.out.printf(" Автомобиль %s %s заезжал на пит-стоп 2 раза ",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void bestTimeCircle() {
        System.out.printf(" Автомобиль %s %s проехал круг за 35 секунд",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.printf(" Автомобиль %s %s двигался с максимальной скоростью 190 км/ч",
                this.getBrand(),
                this.getModel());
    }

    public LiftingСapacity getLiftingСapacity() {
        return liftingСapacity;
    }

    public void setLiftingСapacity(LiftingСapacity liftingСapacity) {
        this.liftingСapacity = liftingСapacity;
    }
}