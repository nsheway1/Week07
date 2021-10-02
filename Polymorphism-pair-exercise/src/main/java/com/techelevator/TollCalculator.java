package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class TollCalculator {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<Vehicle>();

        Vehicle carWithoutTrailer = new Car(false);
        Vehicle carWithTrailer = new Car(true);
        Vehicle tank = new Tank();
        Vehicle truckWithFourAxles = new Truck(4);
        Vehicle truckWithSixAxles = new Truck(6);
        Vehicle truckWithEightAxles = new Truck(8);

        vehicles.add(carWithoutTrailer);
        vehicles.add(carWithTrailer);
        vehicles.add(tank);
        vehicles.add(truckWithFourAxles);
        vehicles.add(truckWithSixAxles);
        vehicles.add(truckWithEightAxles);

        System.out.println();
        System.out.println();
        System.out.println("Vehicle              Distance Traveled         Toll $");
        System.out.println("-----------------------------------------------------");


        for (Vehicle vehicle : vehicles) {
            int randomNumberForDistance = (int)Math.floor(Math.random()*(240-10+1)+10);
            System.out.printf("%-25s", vehicle);
            System.out.printf("%-20s", randomNumberForDistance);
            System.out.printf("%6.2f", vehicle.calculateToll(randomNumberForDistance));
            System.out.println();
        }





    }
}
