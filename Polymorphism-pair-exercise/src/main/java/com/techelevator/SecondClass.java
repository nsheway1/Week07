package com.techelevator;

public class SecondClass extends DeliveryType{

    public SecondClass(int distance, double weight){
        super(distance,weight);
    }

    @Override
    public double calculateRate(int distance, double weight) {
        if (weight < 3){
            return distance * 0.0035;
        } else if (weight < 9){
            return distance * 0.0040;
        }else if ( weight < 16){
            return distance * 0.0047;
        }else if (weight < 64){
            return distance * 0.0195;
        }else if (weight < 144){
            return distance * 0.045;
        }else {
            return distance * 0.05;
        }

    }
}
