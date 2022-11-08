package Driver;

import Transport.Transport;

public class Driver<T extends Transport> {
   private final  String name;
   private final String driverLicense;
   private final int drivingExperience;
   private final T car;

    public Driver(String name,
                  String driverLicense,
                  int drivingExperience,
                  T car) {
        this.name = name;
        this.driverLicense = driverLicense;
        this.drivingExperience = drivingExperience;
        this.car = car;
    }

    public void startDriving(){
        System.out.printf("Водитель %s начинает движение ", this.name);
        this.car.startMoving();
    }


    public void stopDriving() {
        System.out.printf("Водитель %s заканчивает движение ", this.name);
        this.car.stopMoving();
    }
//    public abstract void reFuel();

    public String getName() {
        return name;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public T getCar() {
        return car;
    }

    @Override
    public String toString() {
        return String.format(
                "Водитель %s управляет автомобилем %s %s и принимает участие в гонке",
                this.name,
                this.car.getBrand(),
                this.car.getModel()
        );
    }
}


