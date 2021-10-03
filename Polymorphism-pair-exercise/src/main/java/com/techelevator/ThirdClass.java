package com.techelevator;

public class ThirdClass extends DeliveryType{
    public ThirdClass(int distance, double weight){
        super(distance,weight);
    }

    @Override
    public double calculateRate(int distance, double weight) {
        if (weight < 3){
            return distance * 0.0020;
        } else if (weight < 9){
            return distance * 0.0022;
        }else if ( weight < 16){
            return distance * 0.0024;
        }else if (weight < 64){
            return distance * 0.0150;
        }else if (weight < 144){
            return distance * 0.0160;
        }else {
            return distance * 0.0170;
        }

    }
}
