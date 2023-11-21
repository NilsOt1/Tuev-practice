package de.neuefische;

public class CarInspectionService {
    public boolean checksFor4Tires(Car car) {
        return car.getNumberOfTires() == 4;
    }

    public boolean checksForSeatBelt(Car car) {
        return car.isSeatBelt();

    }

    public boolean checksForAirbag(Car car) {
        return car.isAirbag();
    }

    public boolean checksForDoors(Car car) {
        return car.getNumberOfDoors() == 5 || car.getNumberOfDoors() == 3;
    }

    public boolean checkCar(Car car) {
        return checksFor4Tires(car) && checksFor4Tires(car) && checksForAirbag(car) && checksForSeatBelt(car);
    }
}
