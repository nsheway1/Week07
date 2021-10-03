package com.techelevator;

public class FirstClass extends DeliveryType {

    public FirstClass(int distance, double weight){
        super(distance,weight);
    }

    @Override
    public double calculateRate(int distance, double weight) {
        if (weight < 3){
            return distance * 0.035;
        } else if (weight < 9){
            return distance * 0.040;
        }else if ( weight < 16){
            return distance * 0.047;
        }else if (weight < 64){
            return distance * 0.195;
        }else if (weight < 144){
            return distance * 0.45;
        }else {
            return distance * 0.5;
        }

    }
}
