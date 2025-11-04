package org.example.cars;

public class Car {
    private String brand;
    private String body;
    private Engine engine;
    private Wheel[] wheels;
    private double fuelLevel;

    public Car(String brand, String body, Engine engine, Wheel[] wheels) {
        this.brand = brand;
        this.body = body;
        this.engine = engine;
        this.wheels = wheels;
        this.fuelLevel = 0;
    }

    public void drive() {
        if (fuelLevel > 0) {
            System.out.println(brand + " едет!");
            fuelLevel -= 5;
        } else {
            System.out.println(brand + " не может ехать — нет топлива!");
        }
    }

    public void refuel(double liters) {
        if (liters > 0) {
            fuelLevel += liters;
            System.out.println("Заправлено " + liters + " литров. Текущий уровень: " + fuelLevel + " л.");
        }
    }

    public void changeWheel(int index, Wheel newWheel) {
        if (index >= 0 && index < wheels.length) {
            wheels[index] = newWheel;
            System.out.println("Колесо №" + (index + 1) + " заменено.");
        } else {
            System.out.println("Неверный индекс колеса.");
        }
    }

    public void printBrand() {
        System.out.println("Марка автомобиля: " + brand);
    }

    public String getBrand() {
        return brand;
    }

    public String getBody() {
        return body;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Автомобиль: Марка = '").append(brand).append("',\n");
        sb.append("Двигатель: ").append(engine).append(",\n");
        sb.append("Колёса: \n");
        for (int i = 0; i < wheels.length; i++) {
            sb.append("  ").append(wheels[i]).append("\n");
        }
        sb.append("Топливо: ").append(fuelLevel).append(" л.");
        return sb.toString();
    }
}