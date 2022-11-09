package Driver;

import Transport.Car;

public class DriverB extends Driver<Car> {


    public DriverB(String name, String driverLicense, int drivingExperience, Car car) {
        super(name, "B", drivingExperience, car);
    }

    @Override
    public void startDriving() {

    }

    @Override
    public void stopDriving() {

    }

}