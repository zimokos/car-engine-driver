package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    public String carModel;
    public String carClass;
    public int weight;
    public Driver driver;
    public Engine motor;

    public void start() {
        System.out.println("");
    }

    public void stop() {
        System.out.println("");
    }

    public void turnRight() {
        System.out.println("");
    }

    public void turnLeft() {
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", motor=" + motor +
                '}';
    }
}
