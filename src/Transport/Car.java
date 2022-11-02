package Transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String gears;
    private final String typeBody;
    private String regNumber;
    private final int seatCount;
    private boolean summerTyres;
    private Key key;
    private Insurance insurance;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               Integer productionYear,
               String productionCountry,
               Key key,
               Insurance insurance) {
        this.gears = "mechanic";
        this.typeBody = "Sedan";
        this.seatCount = 5;
        this.regNumber = "x000xx000";
        this.summerTyres = true;

        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }


        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "White";
        } else {
            this.color = color;
        }
        if (key == null) {
            this.key = new Key();
        }else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        }else {
            this.insurance = insurance;
        }
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null) {
            this.color = "White";
        } else {
            this.color = color;
        }
    }

    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
        if (gears == null) {
            this.gears = "mechanics";
        } else {
            this.gears = gears;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTypeBody() {
        return typeBody;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void changeTyres() {
        summerTyres = !summerTyres;
    }

    public boolean isCorrectRegNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
        char[] chars = regNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3])
                && Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
        }

    public static class Key {
        private final boolean remoteRunEngine;
        private final boolean withoutKEyAcces;

        public Key(boolean remoteRunEngine, boolean withoutKEyAcces) {
            this.remoteRunEngine = remoteRunEngine;
            this.withoutKEyAcces = withoutKEyAcces;
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isWithoutKEyAcces() {
            return withoutKEyAcces;
        }

        public Key() {
            this(false, false);
        }
    }

    public static class Insurance {
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            }else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            }else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 10000, null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println(" Нужно ехать оформлять страховку ");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println(" Номер страховки некорректный ");
            }

        }

    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Insurance getInsurance() {
        return insurance;
    }
}
