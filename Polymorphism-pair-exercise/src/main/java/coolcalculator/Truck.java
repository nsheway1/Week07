package coolcalculator;

public class Truck implements Vehicle {

    // Member variable
    private int numberOfAxles;

    // Constructor
    public Truck(int numberOfAxles) {
       this.numberOfAxles = numberOfAxles;
    }

    // Getter
    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    // Interface Method Implemented

    @Override
    public double calculateToll(int distance) {
        if(this.numberOfAxles == 4) {
            return distance * 0.040;
        } else if(this.numberOfAxles == 6) {
            return distance * 0.045;
        }
        return distance * 0.048;
    }

    @Override
    public String toString() {
        return "Truck (" + this.numberOfAxles + " axles)";
    }
}
