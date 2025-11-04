package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1 ");
        try {
            Task1.createFile();
            Task1.printFileInfo();
            Task1.readFileContent();
        } catch (IOException e) {
            System.err.println("Ошибка в задании 1: " + e.getMessage());
        }

        System.out.println("\nЗадание №2 ");
        try {
            Task2.inputTemperatures();
            Task2.calculateAverageTemperature();
        } catch (IOException e) {
            System.err.println("Ошибка в задании 2: " + e.getMessage());
        }

        System.out.println("\nЗадание №3 ");
        try {
            Task3.generateRandomNumbers();
            Task3.splitNumbers();
        } catch (IOException e) {
            System.err.println("Ошибка в задании 3: " + e.getMessage());
        }
    }
}