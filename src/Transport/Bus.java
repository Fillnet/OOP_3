package Transport;

public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Стартует");
    }

    @Override
    public void stopMoving() {
        System.out.println("Останавливается");
    }

    @Override
    public String pitStop() {
        return "8 пит стопа";
    }

    @Override
    public int bestTimeCircle() {
        return 125;
    }

    @Override
    public int maxSpeed() {
        return 90;
    }
}