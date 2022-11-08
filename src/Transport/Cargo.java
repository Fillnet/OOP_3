package Transport;


public class Cargo extends Transport implements Competing{
    public Cargo(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.printf(" Автомобиль %s %s Стартует",
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
}