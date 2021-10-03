package com.techelevator;

public abstract class DeliveryType implements DeliveryDriver {

    private int distance;
    private double weight;

    public DeliveryType(int distance, double weight){
        this.distance = distance;
        this.weight = weight;

    }



}
