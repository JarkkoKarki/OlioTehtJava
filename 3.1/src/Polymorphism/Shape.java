package Polymorphism;
class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return height * width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
class Triangle extends Shape{
    private double height;
    private double base;

    public double getHeight() {
        return height;
    }
    public double getBase() {
        return base;
    }
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return 0.5 * height * base;
    }
}

public class Shape {
    public double calculateArea() {
        return 0;
    }
}
