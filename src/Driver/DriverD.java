package Driver;

import Transport.Bus;

public class DriverD extends Driver<Bus> {

    public DriverD(String name, String driverLicense, int drivingExperience, Bus bus) {
        super(name, "D", drivingExperience, bus);
    }

    @Override
    public void startDriving() {

    }

    @Override
    public void stopDriving() {

    }


}