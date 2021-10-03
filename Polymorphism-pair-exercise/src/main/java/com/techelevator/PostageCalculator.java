package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostageCalculator {

    public static void main(String[] args) {

        Scanner userInput = new Scanner ( System.in );

        System.out.println("Please enter the weight of the package?");
        String weightOfPackageEnteredByUser = userInput.nextLine();

        System.out.println("(P)ounds or (O)unces?");
        String poundsOrOunces = userInput.nextLine();

        System.out.println("What distance will it be traveling?");
        String distanceToBeTraveled = userInput.nextLine();

        Double weightOfPackage = Double.parseDouble(weightOfPackageEnteredByUser);

        if (poundsOrOunces.equals("P")) {
            weightOfPackage = weightOfPackage * 16;
        }

        Integer distanceAsAnInt = Integer.parseInt(distanceToBeTraveled);



        List<DeliveryType> deliveryTypes = new ArrayList<DeliveryType>();
        deliveryTypes.add(new FirstClass(distanceAsAnInt, weightOfPackage));
        deliveryTypes.add(new SecondClass(distanceAsAnInt, weightOfPackage));
        deliveryTypes.add(new ThirdClass(distanceAsAnInt, weightOfPackage));
        deliveryTypes.add(new FexEd(distanceAsAnInt, weightOfPackage));
        deliveryTypes.add(new SPU4DayGround(distanceAsAnInt,weightOfPackage));
        deliveryTypes.add(new SPU2DayBusiness(distanceAsAnInt, weightOfPackage));
        deliveryTypes.add(new SPUNextDay(distanceAsAnInt, weightOfPackage));

        System.out.println();
        System.out.println("Delivery Method                 $ cost");
        System.out.println("--------------------------------------");

        for (DeliveryType type : deliveryTypes) {
            System.out.printf("%-30s" , type);
            System.out.printf("%6.2f", type.calculateRate(distanceAsAnInt, weightOfPackage));
            System.out.println();
        }




    }
}
