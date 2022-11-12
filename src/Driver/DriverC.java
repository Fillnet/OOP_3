package Driver;

import Transport.Truck;

public class DriverC extends Driver<Truck> {

    public DriverC(String name, String driverLicense, int drivingExperience, Truck truck) {
        super(name, "C", drivingExperience, truck);
    }

    @Override
    public void startDriving() {

    }

    @Override
    public void stopDriving() {

    }

}