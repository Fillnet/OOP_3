package Transport;


public class Bus extends Transport implements Competing {
    private Capacity capacity;
    public Bus(String brand, String model, double engineVolume,Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity=capacity;
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
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по авто не достаточно ");
        } else {
            String from = String.valueOf(capacity.getFrom());
            String to = String.valueOf(capacity.getTo());
            System.out.println("Автобус: "+getBrand()+" "+getModel()+" Класс автобуса: " + getCapacity() + " количество мест от " + from+" чел. до " + to+" чел.");
        }
    }

    @Override
    public void pitStop() {
        System.out.printf(" Автомобиль %s %s заезжал на пит-стоп 4 раза ",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void bestTimeCircle() {
        System.out.printf(" Автомобиль %s %s проехал круг за 67 секунд",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.printf(" Автомобиль %s %s двигался с максимальной скоростью 130 км/ч",
                this.getBrand(),
                this.getModel());
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }
}