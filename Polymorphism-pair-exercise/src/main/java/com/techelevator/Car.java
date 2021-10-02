package com.techelevator;

public class Car implements Vehicle {

    // Member variable
    private boolean hasTrailer = false;

    // Constructor
    public Car(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    // Getter
    public boolean isHasTrailer() {
        return hasTrailer;
    }

    // Interface method implemented
    @Override
    public double calculateToll(int distance) {
       if(hasTrailer) {
            return distance * 0.020 + 1;
        }
        return distance * 0.020;
    }

    @Override
    public String toString() {
        if(hasTrailer) {
            return "Car (with trailer)";
        }
        return "Car";
    }
}
