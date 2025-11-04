package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вариант 2. Фигуры");

        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        System.out.println(circle);
        System.out.println(rectangle);

        Shape[] shapes = {circle, rectangle};
        System.out.println("\nПлощади фигур: ");
        for (Shape shape : shapes) {
            System.out.println("Площадь: " + shape.calculateArea() + "(см².)");
        }
    }
}