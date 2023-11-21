package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInspectionServiceTest {
    @Test
    void returnsTrue_WhenCarHas4Tires() {
        //GIVEN
        Car car = new Car(4, 2, true, true);
        CarInspectionService carInspectionService = new CarInspectionService();
        //WHEN
        boolean actual = carInspectionService.checksFor4Tires(car);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checksForSeatBelt() {
        //GIVEN
        Car car = new Car(4,2,true, true);
        CarInspectionService carInspectionService = new CarInspectionService();
        //WHEN
        boolean actual = carInspectionService.checksForSeatBelt(car);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checksForAirbag() {
        //GIVEN
        Car car = new Car(4,2,true, true);
        CarInspectionService carInspectionService = new CarInspectionService();
        //WHEN
        boolean actual = carInspectionService.checksForAirbag(car);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checksForDoors() {
        //GIVEN
        Car car = new Car(4,3,true,true);
        CarInspectionService carInspectionService = new CarInspectionService();
        //WHEN
        boolean actual = carInspectionService.checksForDoors(car);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checkCar() {
        //GIVEN
        Car car = new Car(4,4,true,true);
        CarInspectionService carInspectionService = new CarInspectionService();
        //WHEN
        boolean actual = carInspectionService.checkCar(car);
        //THEN
        assertTrue(actual);
    }
}