package com.techelevator;

public class SPU2DayBusiness extends DeliveryType {

    public SPU2DayBusiness(int distance, double weight) {
        super(distance, weight);
    }

    public double calculateRate(int distance, double weight) {
        double rate = ((weight/16) * 0.0050) * distance;
        return rate;
    }

    @Override
    public String toString() {
        return "SPU (2-Day Business)";
    }
}
