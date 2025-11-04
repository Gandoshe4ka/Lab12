package org.example;

import java.io.*;
import java.util.Random;

public class Task3 {
    private static final String INPUT_FILE = "Рандомные.txt";
    private static final String POSITIVE_FILE = "Положительные.txt";
    private static final String NON_POSITIVE_FILE = "Отрицательные.txt";

    public static void generateRandomNumbers() throws IOException {
        Random rand = new Random();
        try (PrintWriter writer = new PrintWriter(new FileWriter(INPUT_FILE))) {
            for (int i = 0; i < 20; i++) {
                double num = (rand.nextDouble() * 200) - 100; // [-100, 100)
                writer.printf("%.2f%n", num);
            }
        }
        System.out.println("Случайные числа записаны в '" + INPUT_FILE + "'.");
    }

    public static void splitNumbers() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE));
             PrintWriter posWriter = new PrintWriter(new FileWriter(POSITIVE_FILE));
             PrintWriter negWriter = new PrintWriter(new FileWriter(NON_POSITIVE_FILE))) {

            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    String cleanLine = line.trim().replace(',', '.');
                    double num = Double.parseDouble(cleanLine);
                    if (num > 0) {
                        posWriter.println(num);
                    } else {
                        negWriter.println(num);
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Некорректное число: " + line);
                }
            }
        }
        System.out.println("Числа > 0 записаны в файл: " + POSITIVE_FILE);
        System.out.println("Числа < 0 записаны в файл: " + NON_POSITIVE_FILE);
    }
}