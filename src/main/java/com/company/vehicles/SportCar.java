package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String carModel, String carClass, int weight, Driver driver, Engine motor, int maxSpeed) {
        super(carModel, carClass, weight, driver, motor);
        this.maxSpeed = maxSpeed;
    }

    public SportCar() {
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
