package Transport;


import Driver.Driver;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    private final String brand;
    private String model;
    //    private final int productionYear;
//    private final String productionCountry;
//    private String color;
//    private int maxSpeed;
    private double engineVolume;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();
    private final List<Mechanic<?>> mechanics = new ArrayList<>();

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
//        }
            if (model == null) {
                this.model = "default";
            } else {
                this.model = model;
            }
            if (engineVolume == 0) {
                this.engineVolume = 1.5;
            } else {
                this.engineVolume = engineVolume;
            }
        }


    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void printType();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void addDriver(Driver<?> driver) {
        drivers.add(driver);
    } public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    } public void addMechanic(Mechanic<?> mechanic) {
        mechanics.add(mechanic);
    }

    public abstract boolean diagnostic();

    public void repair() {

    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }
}