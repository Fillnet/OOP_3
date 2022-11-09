package Transport;


public abstract class Transport {
    private final String brand;
    private String model;
    //    private final int productionYear;
//    private final String productionCountry;
//    private String color;
//    private int maxSpeed;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
//        this.color = "White";
//        this.maxSpeed = 220;
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
            }else {
                this.engineVolume = engineVolume;
            }
//        if (productionCountry == null) {
//            this.productionCountry = "default";
//        } else {
//            this.productionCountry = productionCountry;
//        }
//        if (productionYear == 0) {
//            this.productionYear = 2000;
//        } else {
//            this.productionYear = productionYear;
//        }

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
}