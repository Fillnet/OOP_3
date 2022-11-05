package Transport;

public class tarin extends transport{
    private int priceTrip;
    private double timeTrip;
    private final String departureStation;
    private final String finalStation;
    private int qauantyWagons;

    public tarin(String brand, String model, int productionYear, String productionCountry, String departureStation, String finalStation) {
        super(brand, model, productionYear, productionCountry);
        if (departureStation == null) {
            this.departureStation = "Не указана станция отправления: ";
        }else {
        this.departureStation = departureStation;
        }
        if (finalStation == null) {
            this.finalStation = "Не указана станция назначения: ";
        }else {
            this.finalStation = finalStation;

        }
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getFinalStation() {
        return finalStation;
    }

    public int getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(int priceTrip) {
        this.priceTrip = priceTrip;
    }

    public double getTimeTrip() {
        return timeTrip;
    }

    public void setTimeTrip(double timeTrip) {
        this.timeTrip = timeTrip;
    }

    public int getQauantyWagons() {
        return qauantyWagons;
    }

    public void setQauantyWagons(int qauantyWagons) {
        this.qauantyWagons = qauantyWagons;
    }

    @Override
    public void refill() {
        System.out.println(" Заправляется дизелем");
    }
}
