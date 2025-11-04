package org.example.task1;

public class Vehicle {
    protected String model;

    public Vehicle(String model) {
        this.model = model;
    }

    public void start() {
        System.out.println("Транспортное средство " + model + " запущено");
    }

    @Override
    public String toString() {
        return String.format("Модель автомобиля(объект): " + model);
    }
}