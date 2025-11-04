package org.example.cars;

public class Wheel {
    private double diameter;
    private String brand;

    public Wheel(double diameter, String brand) {
        this.diameter = diameter;
        this.brand = brand;
    }

    public double getDiameter() {
        return diameter;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Колесо: " + " Диаметр = " + diameter + ", Бренд = '" + brand + '\'';
    }
}
