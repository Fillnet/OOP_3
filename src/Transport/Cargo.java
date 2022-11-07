package Transport;

public class Cargo extends Transport implements Competing{
    public Cargo(String brand, String model, double engineVolume) {
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
        return "5 пит стопа";
    }

    @Override
    public int bestTimeCircle() {
        return 68;
    }

    @Override
    public int maxSpeed() {
        return 120;
    }
}