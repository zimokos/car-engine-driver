package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Engine motor1 = new Engine(520, "Renault Trucks");
        Driver driver1 = new Driver("Fernando Alonso", 25);
        Lorry lorry = new Lorry("Renault", "Truck", 7659, driver1, motor1, 22000);
        lorry.start();
        lorry.stop();
        lorry.turnRight();
        lorry.turnLeft();

        System.out.println();

        Engine motor2 = new Engine(800, "Ferrari");
        Driver driver2 = new Driver("Charles Leclerc", 15);
        SportCar sportCar = new SportCar("Ferrari", "Roadster", 1600, driver2, motor2, 340);
        sportCar.start();
        sportCar.stop();
        sportCar.turnRight();
        sportCar.turnLeft();
    }
}
