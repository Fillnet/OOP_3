package Transport;

public class Bus extends transport {
    public Bus(String brand, String model, int productionYear, String productionCountry) {
        super(brand, model, productionYear, productionCountry);

    }

    @Override
    public void refill() {
        System.out.println("Заправляется бензином ");
    }
}
