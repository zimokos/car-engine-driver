package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
    private int carryingCapacity;

    public Lorry(String carModel, String carClass, int weight, Driver driver, Engine motor, int carryingCapacity) {
        super(carModel, carClass, weight, driver, motor);
        this.carryingCapacity = carryingCapacity;
    }

    public Lorry() {
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
}
