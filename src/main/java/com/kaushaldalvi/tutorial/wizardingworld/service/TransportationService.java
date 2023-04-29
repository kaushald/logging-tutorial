package com.kaushaldalvi.tutorial.wizardingworld.service;

import com.kaushaldalvi.tutorial.wizardingworld.model.TransportationOption;
import org.springframework.stereotype.Service;
import java.util.concurrent.ThreadLocalRandom;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransportationService {

    private final List<TransportationOption> transportationOptions = new ArrayList<>();

    public TransportationService() {
        transportationOptions.add(new TransportationOption("Floo Network",
                "Travel through the connected fireplaces " + "using Floo powder."));

        transportationOptions.add(new TransportationOption("Portkey",
                "Magically enchanted object that instantly " + "transports anyone touching it to a specific " +
                "location."));

        transportationOptions.add(new TransportationOption("Broomstick",
                "Fly through the air on a magical broomstick" + " for a fast and flexible travel option."));

        transportationOptions.add(new TransportationOption("Thestral Carriage", "Ride in a carriage pulled by " +
                                                                                "invisible Thestrals, providing a " +
                                                                                "swift and mysterious journey."));

        transportationOptions.add(new TransportationOption("Apparition", "Instantly teleport from one location to " +
                                                                         "another, but requires a license and may " +
                                                                         "cause disorientation."));

        transportationOptions.add(new TransportationOption("Magic Carpet", "Fly through the air on an enchanted " +
                                                                           "carpet, offering a comfortable and " +
                                                                           "leisurely travel experience."));

        transportationOptions.add(new TransportationOption("Vanishing Cabinet", "Step into one cabinet and instantly " +
                                                                                "reappear in a paired cabinet, " +
                                                                                "enabling covert and instant " +
                                                                                "transportation."));


        transportationOptions.add(new TransportationOption("Knight Bus", "Hail the magical triple-decker bus for " +
                                                                         "emergency transport in the wizarding world," +
                                                                         " providing a chaotic and fast journey."));

        transportationOptions.add(new TransportationOption("Flying Car", "Travel in a bewitched car with the ability " +
                                                                         "to fly, offering a mix of Muggle and " +
                                                                         "magical transportation."));

        transportationOptions.add(new TransportationOption("Hippogriff", "Ride on the back of a majestic Hippogriff, " +
                                                                         "providing a thrilling and unique mode of " +
                                                                         "travel."));

    }

    public TransportationOption getBestTransportationOption(String startingPoint, String destination) {
        int distance = getDistance(startingPoint, destination);

        int index = distance % transportationOptions.size();
        return transportationOptions.get(index);
    }

    private static int getDistance(String startingPoint, String destination) {
        try {
            // Generate a random delay between 250ms and 1000ms
            int delay = ThreadLocalRandom.current().nextInt(250, 1001);

            // Sleep for the random delay
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            // If the sleep is interrupted, print the error
            e.printStackTrace();
        }

        return startingPoint.length() + destination.length();
    }
}
