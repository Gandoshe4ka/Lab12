package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Вариант 2. Фигуры");

        Circle circle = new Circle(5.0, "Red");
        Shape circle1 = new Circle(5.0, "Yellow");

        System.out.println(circle);
        circle.setRadius(6.0);
        System.out.println("После изменения радиуса: " + circle);

        Rectangle rectangle = new Rectangle(4.0, 7.0, "Red");
        System.out.println(rectangle);

        rectangle.setHeight(10.0);
        System.out.println("После изменения высоты: " + rectangle);

        System.out.println("\nРасчёт площади фигур: ");

        Shape[] shapes = {circle, rectangle};
        for (Shape shape : shapes) {
            System.out.println("Площадь: " + String.format("%.2f", shape.calculateArea()));
        }
    }
}