package com.techelevator;

public class SPUNextDay extends DeliveryType {

    public SPUNextDay(int distance, double weight) {
        super(distance, weight);
    }

    public double calculateRate(int distance, double weight) {
        double rate = ((weight/16) * 0.075) * distance;
        return rate;
    }

    @Override
    public String toString() {
        return "SPU (Next Day)";
    }
}
