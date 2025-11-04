package org.example;

import org.example.pets.Hamster;
import org.example.cars.Car;
import org.example.cars.Engine;
import org.example.cars.Wheel;

public class Main {
    public static void main(String[] args) {

        System.out.println("Вариант 2. Хомячок");
        Hamster hamster = new Hamster("Рэмбо", 1, "Рыжий", true);
        System.out.println(hamster);
        hamster.ageMark();
        hamster.eat();
        hamster.status();

        System.out.println("\nВариант 2. Автомобиль");

        System.out.println("\nМашина по умолчанию: \n");

        Engine engine = new Engine(130, "Дизель");
        Wheel[] wheels = {
                new Wheel(17, "Michelin"),
                new Wheel(17, "Michelin"),
                new Wheel(17, "Continental"),
                new Wheel(17, "Continental")};

        Car car = new Car("Opel GrandLand X", "Кроссовер", engine, wheels);

        System.out.println(car);
        System.out.println("\nВыполнение методов: \n");

        car.printBrand();
        engine.start();
        car.refuel(40);
        car.drive();
        car.changeWheel(0, new Wheel(17, "Goodyear"));

        System.out.println("\nМашина после выполнения методов: \n");
        System.out.println(car);
    }
}