package com.kaushaldalvi.tutorial.wizardingworld.controller;

import com.kaushaldalvi.tutorial.wizardingworld.model.TransportationOption;
import com.kaushaldalvi.tutorial.wizardingworld.service.TransportationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transportation")
public class TransportationController {

    private static final Logger logger = LoggerFactory.getLogger(TransportationController.class);

    private final TransportationService transportationService;

    @Autowired
    public TransportationController(TransportationService transportationService) {
        this.transportationService = transportationService;
    }

    @GetMapping
    public TransportationOption getBestTransportationOption(@RequestParam("startingPoint") String startingPointName,
                                                            @RequestParam("destination") String destinationName) {

        logger.debug("Entering getBestTransportationOption method");

        TransportationOption bestOption =
                transportationService.getBestTransportationOption(startingPointName, destinationName);

        logger.info("Source: {}", startingPointName);
        logger.info("Destination: {}", destinationName);
        logger.info("Best option: {}", bestOption.getName());

        logger.debug("Exiting getBestTransportationOption method");

        return bestOption;
    }
}
