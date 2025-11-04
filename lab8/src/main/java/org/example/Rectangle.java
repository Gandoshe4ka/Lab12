package org.example;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Ширина и высота не могут быть отрицательными");
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Ширина не может быть отрицательной");
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("Высота не может быть отрицательной");
        }
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Прямоугольник: ширина = " + width + "(см.), высота = " + height + "(см.), площадь = " + String.format("%.2f", calculateArea()) + "(см².)";
    }
}