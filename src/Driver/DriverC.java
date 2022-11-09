package Driver;

import Transport.Cargo;

public class DriverC extends Driver<Cargo> {

    public DriverC(String name, String driverLicense, int drivingExperience, Cargo cargo) {
        super(name, "C", drivingExperience, cargo);
    }

    @Override
    public void startDriving() {

    }

    @Override
    public void stopDriving() {

    }

}