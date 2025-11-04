package org.example;

import java.io.*;
import java.util.Scanner;

public class Task2 {
    private static final String TEMP_FILE = "Температуры.txt";

    public static void inputTemperatures() throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(TEMP_FILE))) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите 15 вещественных значений температуры:");
            for (int i = 0; i < 15; i++) {
                System.out.print("Температура " + (i + 1) + ": ");
                double temp = scanner.nextDouble();
                writer.println(temp);
            }
        }
        System.out.println("Температуры сохранены в файл '" + TEMP_FILE + "'.");
    }

    public static void calculateAverageTemperature() {
        try (BufferedReader reader = new BufferedReader(new FileReader(TEMP_FILE))) {
            String line;
            double sum = 0;
            int count = 0;
            while ((line = reader.readLine()) != null) {
                try {
                    String cleanLine = line.trim().replace(',', '.');
                    double temp = Double.parseDouble(cleanLine);
                    sum += temp;
                    count++;
                } catch (NumberFormatException e) {
                    System.err.println("Некорректное значение: " + line);
                }
            }
            if (count > 0) {
                double average = sum / count;
                System.out.printf("Средняя температура: %.2f%n", average);
            } else {
                System.out.println("Нет корректных данных.");
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}