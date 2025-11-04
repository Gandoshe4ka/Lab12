package org.example.cars;

public class Engine {
    private double horsepower;
    private String fuelType;

    public Engine(double horsepower, String fuelType) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }

    public double getHorsepower() {
        return horsepower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void start() {
        System.out.println("Двигатель запущен (" + fuelType + ", " + horsepower + " л.с.)");
    }

    @Override
    public String toString() {
        return "Мощность = " + horsepower + " л.с., Топливо = '" + fuelType + '\'';
    }
}