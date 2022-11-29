package Driver;

import Transport.PassengerCar;

public class DriverB extends Driver<PassengerCar> {


    public DriverB(String name, String driverLicense, int drivingExperience, PassengerCar passengerCar) {
        super(name, "B", drivingExperience, passengerCar);
    }

    @Override
    public void startDriving() {

    }

    @Override
    public void stopDriving() {

    }

}