package org.example;

public class Circle implements Shape,  Color{
    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getColor() {
        return "Зеленый";
    }

    @Override
    public String toString() {
        return "Круг: радиус = " + radius + "(см.), площадь = " + String.format("%.2f", calculateArea()) + "(см².)";
    }

}