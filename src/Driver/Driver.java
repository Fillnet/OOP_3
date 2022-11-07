package Driver;

public abstract class Driver {
    public String name;
    boolean driverLicense;
    int drivingExperience;

    public Driver(String name, boolean driverLicense, int drivingExperience) {
        this.name = name;
        this.driverLicense = driverLicense;
        this.drivingExperience = drivingExperience;
    }

    public abstract void startDriving();
    public abstract void stopDriving();
    public abstract void reFuel();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
}
