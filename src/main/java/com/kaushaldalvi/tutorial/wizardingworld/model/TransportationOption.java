package com.kaushaldalvi.tutorial.wizardingworld.model;


public class TransportationOption {
    private String name;
    private String description;

    public TransportationOption() {
    }

    public TransportationOption(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
