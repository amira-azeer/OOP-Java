package com.company;

public class Lamp {
    private String style;
    private boolean batteryPowered;
    private int globeRating;

    public Lamp(String style, boolean batteryPowered, int globeRating) {
        this.style = style;
        this.batteryPowered = batteryPowered;
        this.globeRating = globeRating;
    }

    public String getStyle() {
        return style;
    }

    public boolean isBatteryPowered() {
        return batteryPowered;
    }

    public int getGlobeRating() {
        return globeRating;
    }

    public void turnOn(){
        System.out.println("Lamp Class --> Turning on the Lamp");
    }
}
