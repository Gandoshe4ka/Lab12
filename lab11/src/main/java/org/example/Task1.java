package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Task1 {
    private static final String FILENAME = "Информация.txt";

    public static void createFile() throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))) {
            writer.println("ФИО: Гаврук Артём Анатольевич");
            writer.println("Дата рождения: 20.05.2006");
            writer.println("Город: Новолукомль");
            writer.println("Группа: Т-319");
            writer.println("Курс: 4");
        }
        System.out.println("Файл '" + FILENAME + "' создан.");
    }

    public static void printFileInfo() throws IOException {
        Path path = Path.of(FILENAME);
        if (!Files.exists(path)) {
            System.out.println("Файл не существует.");
            return;
        }

        BasicFileAttributes attrs = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("\nИнформация о файле:");
        System.out.println("Размер: " + attrs.size() + " байт");
        System.out.println("Время создания: " +
                Instant.ofEpochMilli(attrs.creationTime().toMillis())
                        .atZone(ZoneId.systemDefault())
                        .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("Время последнего изменения: " +
                Instant.ofEpochMilli(attrs.lastModifiedTime().toMillis())
                        .atZone(ZoneId.systemDefault())
                        .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }

    public static void readFileContent() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            System.out.println("\nСодержимое файла:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}