package de.neuefische;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Car {
    private int numberOfTires;
    private int numberOfDoors;
    private boolean seatBelt;
    private boolean airbag;
}
